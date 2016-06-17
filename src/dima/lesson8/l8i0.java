package dima.lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by root on 5/30/16.
 *
 * file i/o
 * в джаве есть свой еррор классс, кторый обрабатывает ошибки
 * эесепшены нужны чтобы указать что в метоже может чтото пойти не так
 * ну и управлять этим эксепшенами
 *
 *обабатывать можно ловить и что-то делать
 * а можно указать методу (в сигнатуре меода) что вот такоатя херня может случитсья
 *
 *
 */
public class l8i0 {
    public static void main(String[] args) {

/*
   REader from file
*/


        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/dmitriy/Desktop/test.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // - это надо засовывать в finally
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(" some text");

        }



    }
}
