package dima.homework8.tested;

import java.io.IOException;

/**
 * Created by dmitriy on 6/2/16.
 */
public class FileDisplayContent {
    public static String fileDisplay (String path) throws IOException {
        String read = FileRead.fileRead(path).toString();
        String content = read.substring(1,(read.length()-1));
        return content;
    }
}
