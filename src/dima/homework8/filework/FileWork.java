package dima.homework8.filework;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dmitriy on 6/1/16.
 * Реализовать класс для работы с текстовыми файлами.
 * В нем обязательно должны быть методы для : Считатывания файла в List<String>,
 * Дописывания в файл информации,
 * Удаление строки из файла,
 * Создание нового файла с записью информации.
 * + полезные методы которые сможете себе придумать
 */



public class FileWork {

    private static String path;
    private static String toAppend;
    private static String toDelete;
    private static String folder;
    private static String fileName;


    public static void main(String[] args) throws IOException {
        folder = "/home/dmitriy/Desktop/";
        fileName = "test.txt";
        path = folder+fileName;

        System.out.println("Программа работает с файлом \""+path+"\"");
        System.out.println("Нажмите 1, отобразить файл \nНажмите 2, если ходите дописать строку в файл \nНажмите 3, если ходите удалить строку \nНажмите 0, чтобы прекратить работу");
        int chose;
        try {
            Scanner sc = new Scanner(System.in);
            chose = sc.nextInt();
        switch (chose)
        {
            case 1: {
                System.out.println("содержимое файла: \n ----------------------");
                System.out.println(MyFile.fileDisplayString(path));
            }
                break;
            case 2: {
                System.out.println("введите текст для добавления:");
                Scanner scAdd = new Scanner(System.in);
                toAppend = scAdd.nextLine();
                MyFile.fileAppend(path, toAppend); //добавляется строка в файл
            }
                break;
            case 3: {
                System.out.println("введите текст для удаления:");
                Scanner scDel = new Scanner(System.in);
                toDelete = scDel.nextLine();
                MyFile.deleteString(path, toDelete);
            }
                break;
            case 0:
                break;
        }
    }catch (InputMismatchException e){
        System.out.println("вы ввели что-то не то");
    }


 /*

        System.out.println("----------------");
        System.out.printf(MyFile.fileDisplayString(path));
*//*        for (int i = 0; i<MyFile.fileDisplay(path).length(); i++){

        }*//*
        System.out.println("----------------");
        System.out.println(StringDelete.deleteString(path,toDelete));

       // System.out.println(FileRead.fileRead(path));

*/

    }


}