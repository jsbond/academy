package theory.lecture_13.serialization.example_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;
import theory.lecture_13.serialization.Circle;

class Service {
    public static final Logger logger = Logger.getLogger(Service.class);

    public static void main(String[] args) {
        Circle sr = new Circle();

        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(sr);
//            out.flush();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        Circle object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Circle) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("данные после сериализации/десериализации: ");
        System.out.println("дата: " + object.getCreatedBy());
        System.out.println(" число: " + object.getRadius());
    }
}


