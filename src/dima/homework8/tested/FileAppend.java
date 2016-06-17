package dima.homework8.tested;

import java.io.IOException;

/**
 * Created by dmitriy on 6/1/16.
 */
public class FileAppend {
    public static void fileAppend (String path, String toAppend) throws IOException {

    //ArrayList fileExistContent = new ArrayList();
    StringBuilder fileExistContent = new StringBuilder();
    fileExistContent.append(FileRead.fileRead(path));
    FileWrite.fileWrite(path, (fileExistContent+"\n"+toAppend));

}
}
