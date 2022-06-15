package bufferedreaderexample;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

/**
 * @author luis
 */
public class BufferedReaderExample {

    public static void main(String[] args) throws RuntimeException {

//        File myFile = new File("example.txt");
        File myFile = new File("/Users/molicode/workspace-molicode/java/advanced-java-programming-from-bethan-palmer/Exercise Files/Ch07/07_03/begin/BufferedReaderExample/example.txt");
        try {
            final BufferedReader reader = new BufferedReader(new FileReader(myFile));

            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
