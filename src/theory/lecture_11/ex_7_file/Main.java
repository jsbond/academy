package theory.lecture_11.ex_7_file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main( String[] args )
    {
        try {

            File file = new File("d:\\newfile.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
