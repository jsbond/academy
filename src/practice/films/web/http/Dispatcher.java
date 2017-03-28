package practice.films.web.http;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.collect.ImmutableList;
import practice.films.web.controller.Controller;
import practice.films.web.controller.SiteController;
import practice.films.web.controller.UserController;
import practice.films.web.exception.BadRequestException;

public class Dispatcher {
    private final List<Controller> controllers;
    private Invoker invoker = new Invoker();

    private Pattern slashPattern = Pattern.compile("[/\\\\]");
    private Pattern colonPattern = Pattern.compile(":");

    public String dispatch(String url) {
        HttpMethod httpMethod = getHttpMethod(url);
        url = getUrlWithoutSitePreffix(url);
        Target target = getTargetForInvoke(url, httpMethod);

        Object result = invoker.invoke(target.controller, target.method, target.parameters);
        return result.getClass().cast(result).toString();
    }

    private Target getTargetForInvoke(String requestedUrl, HttpMethod requestedHttpMethod) {
        Target target = null;

        for (Controller controller : controllers) {
            Method[] methods = controller.getClass().getMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(RequestMapping.class)) {
                    RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);

                    boolean isTargetMethod = isMethodToInvoke(
                            requestedUrl,
                            requestedHttpMethod,
                            requestMapping.path(),
                            requestMapping.httpMethod());

                    if (isTargetMethod) {
                        String[] parameters = getParameters(requestedUrl, requestMapping.path());
                        target = new Target(controller, method, parameters);
                        break;
                    }
                }
            }

            if (target != null) {
                target.controller = controller;
                break;
            }
        }
        return target;
    }

    private boolean isMethodToInvoke(String requestedUrl, HttpMethod requestedHttpMethod, String path, HttpMethod httpMethod) {
        if (requestedHttpMethod != httpMethod) {
            return false;
        }

        boolean result = true;

        String[] urlLays = requestedUrl.split("[/\\\\]");
        String[] pathLays = path.split("[/\\\\]");

        for (int i = 0; i < urlLays.length; i++) {
            String urlOne = urlLays[i];
            String pathOne = pathLays[i];

            if (!pathOne.startsWith("{") && !pathOne.equals(urlOne) ) {
                result = false;
            }
        }
        return result;
    }

    private String[] getParameters(String requestedUrl, String path) {
        List<String> params = new ArrayList<>();

        String[] urlLays = requestedUrl.split("[/\\\\]");
        String[] pathLays = path.split("[/\\\\]");

        for (int i = 0; i < urlLays.length; i++) {
            String urlOne = urlLays[i];
            String pathOne = pathLays[i];

            if (pathOne.startsWith("{")) {
                params.add(urlOne);
            }
        }

        return params.toArray(new String[params.size()]);
    }

    private HttpMethod getHttpMethod(String url) {

        Matcher matcher = colonPattern.matcher(url);

        if (!matcher.find()) {
            throw new BadRequestException("http method is not defined in request");
        }

        String httpMethodString =  url.substring(0, matcher.start());
        HttpMethod result = null;

        for (HttpMethod method : HttpMethod.values()) {
            if (method.name().equals(httpMethodString)) {
                result = method;
            }
        }

        if (result == null) {
            throw new BadRequestException("wrong http method is defined in request");
        }
        return result;
    }

    private String getUrlWithoutSitePreffix(String url) {
        Matcher matcher = slashPattern.matcher(url);

        if (matcher.find()) {
            url = url.substring(matcher.start());
        } else {
            url = "";
        }
        return url;
    }


    private static class Invoker {
        private Object invoke(Controller controller, Method method, String... params) {
            try {
                method.setAccessible(true);
                return method.invoke(controller, params);
            } catch (Exception e) {
                throw new BadRequestException(e.getMessage());
            }
        }
    }

    private static class Target {
        private Controller controller;
        private Method method;
        private String[] parameters;

        public Target(Controller controller, Method method, String[] parameters) {
            this.controller = controller;
            this.method = method;
            this.parameters = parameters;
        }
    }

    private static Dispatcher dispatcher;
    private Dispatcher() {
        controllers = ImmutableList.<Controller>builder()
                .add(UserController.getInstance())
                .add(SiteController.getInstance())
                .build();
    }

    public static Dispatcher getInstance() {
        if (dispatcher == null) {
            dispatcher = new Dispatcher();
        }
        return dispatcher;
    }
}
