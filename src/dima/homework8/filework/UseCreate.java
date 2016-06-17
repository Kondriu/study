package dima.homework8.filework;

import java.io.IOException;

/**
 * Created by dmitriy on 6/2/16.
 */
public class UseCreate {

    public static String path;
    public static void main(String[] args) throws IOException {
        path = "/home/dmitriy/Desktop/test2.txt";
        Create.newFileCreate(path);


    }
}
