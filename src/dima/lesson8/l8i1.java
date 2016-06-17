package dima.lesson8;

import java.io.*;

/**
 * Created by root on 5/30/16.
 * прога пишет в файл
 * !!! важно - это  не добавляет а перзаписывает файл
 * чтобы добавить - надо открыть, прочитать, сохранить и записать старое и добавленное новое
 *
 */
public class l8i1 {
    public static void main(String[] args) throws IOException {
        String firstLine = "First line";
        String secLine = "2 line";

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("/home/dmitriy/Desktop/test.txt")));

        writer.append(firstLine);
        writer.newLine();
        writer.append(secLine);
        writer.close();


    }
}
