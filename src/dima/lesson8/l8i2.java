package dima.lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by root on 5/30/16.
 *
 * не правильно в ман рабоатет
 * просмотреть и переделать
 *
 * глава 20 и глава 13 - почитать пор это
 *
 */

public class l8i2 {
    public static void main(String[] args) throws IOException {
        String path = "/home/dmitriy/Desktop/test.txt";}

        public static void readThisFile (String path) throws IOException
        {

            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }

}
