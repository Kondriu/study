package dima.homework8.tested;

import java.io.*;

/**
 * Created by dmitriy on 6/1/16.
 */
public class FileWrite {

    public static void fileWrite (String path, String addLine) throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(path)));

        writer.newLine();
        writer.append(addLine);
        writer.close();

    }
}
