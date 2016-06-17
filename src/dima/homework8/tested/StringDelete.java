package dima.homework8.tested;

import dima.homework8.filework.MyFile;

import java.io.IOException;

/**
 * Created by dmitriy on 6/2/16.
 */
public class StringDelete {
    public static void deleteString (String path, String toDelete) throws IOException {

        String oldFile = MyFile.fileReadToString(path);
        StringBuilder updatedFile = new StringBuilder(oldFile);
        int firstIndex, lastIndex;

        firstIndex = updatedFile.indexOf(toDelete);
        lastIndex = firstIndex+toDelete.length();
        if (firstIndex != -1) {
            updatedFile.delete(firstIndex, lastIndex);
        }else System.out.println("нет такой фразы");
        MyFile.fileWrite(path,updatedFile.toString());
    }
}
