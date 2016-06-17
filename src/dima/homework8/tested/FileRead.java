package dima.homework8.tested;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitriy on 6/1/16.
 */
public class FileRead {

    public static List fileRead (String path) throws IOException {

        BufferedReader reader = null;
        String line = "";
        String content = "";
        ArrayList fileExistContent = new ArrayList();

        try {
            reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                fileExistContent.add(line); //читается файл
                //content += "\n"+line;
                //System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }return fileExistContent;
    }

}
