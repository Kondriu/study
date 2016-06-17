package dima.lesson8;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *  метод file почиттаь
 * Created by root on 5/30/16.
 *
 * надо реализовтаь отдельный класс кторый умеет делать все что мне надо с файлами
 *
 * погуглить что такое класс. метод как их использовтаь
 *
 *
 */
public class l8i4 {
    public static void main(String[] args) {

        String currentDir = "/home/dmitriy/Desktop"; //виндовая системная переменная??
        String filename = "test.txt";
        File file = new File(currentDir, filename);
        System.out.println(file.getAbsolutePath());


/*
        file = new File(file.getAbsoluteFile());

        file.delete() // удаляет файл, а не строку в файле
        file.isFile() // проверияе файл или нет (папка или хз)
        file.canExecute() //
        file.list() // если директория - возращает спсико файлови и папок
        file.getParent() // pwd
        file.lastModified() // В виде long timestamp в milisec


        //есть класс
        PrintWriter out // почитать про него

      //  close () - всегда в finally
    }*/

    }
}
