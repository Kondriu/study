package dima.lesson8;

import java.io.*;

/**
 * Created by root on 5/30/16.
 *
 * глава 20 и глава 13 - почитать пор это
 *
 */
public class l8i3 {
    public static void main(String[] args) throws IOException {
        String filecontent;
        String path = "/home/dmitriy/Desktop/test.txt";

        String line2 = "2 line";

        BufferedWriter write = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("/home/dmitriy/Desktop/test.txt")));
        write.append(MyFileReader(path));
        write.append(line2);

    }



        public static String MyFileReader (String path)  throws IOException {
        String oldline;
        BufferedReader read = new BufferedReader(new FileReader(path));
        oldline = read.toString();
        return oldline;
        }
}
