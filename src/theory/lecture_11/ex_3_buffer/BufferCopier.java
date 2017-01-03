package theory.lecture_11.ex_3_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import theory.lecture_11.Copier;

public class BufferCopier implements Copier {
    private static Logger logger = Logger.getLogger(BufferCopier.class);

    @Override
    public void copy(String resource, String destination) {
        try (BufferedReader in = new BufferedReader(new FileReader(resource));
             PrintWriter out= new PrintWriter(new FileWriter(destination))) {
            String s;

            while ((s = in.readLine()) != null) {
                out.write(s);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
