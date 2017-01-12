package theory.lecture_11;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import theory.lecture_11.ex_1_streams.BytesCopier;
import theory.lecture_11.ex_2_rw.CharactersCopier;
import theory.lecture_11.ex_3_buffer.BufferCopier;

/**
 * Created by Антон on 06.11.2016.
 */
public class Main implements Copier {
    private static final Logger logger = Logger.getLogger(Main.class);
    private Copier helper;

    private static final String RESOURCE_DIRECTORY = "resources/from.txt";
    private static final String DESTINATION_DIRECTORY = "resources/to.txt";

    public Main(Copier helper) {
        this.helper = helper;
    }

    public static void main(String[] args) throws IOException {
//        Main service1 = new Main(new BytesCopier());
//        service1.copy(RESOURCE_DIRECTORY, DESTINATION_DIRECTORY);
//
//        Main service2 = new Main(new CharactersCopier());
//        service2.copy(RESOURCE_DIRECTORY, DESTINATION_DIRECTORY);

        Main service3 = new Main(new BufferCopier());
        service3.copy(RESOURCE_DIRECTORY, DESTINATION_DIRECTORY);
    }

    @Override
    public void copy(String resource, String destination) {
        helper.copy(resource, destination);
        logger.info("файл успешно скопирован");
    }
}
