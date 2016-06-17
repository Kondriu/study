package dima.homework2;

import java.util.Scanner;

/**
 * Created by root on 5/18/16.
 */
public class HomeWork2Java1 {

    public static void main(String[] args) {

/*
        Написать программу которая переобразовывает char в int
        Считывает из консоли символ который вы вводите вручную (в консоль)
        Переобразовывает символ в int
        Выводит числовое значение символа
*/
        char ch1;
        String str1;
        int i1;

        System.out.println("Введите символ:");
        Scanner sc5 = new Scanner(System.in);
        str1 = sc5.next();
        ch1 = str1.charAt(0);
        i1 = (int)ch1;

        System.out.println("вы вели: \'"+ch1+"\' цифровой код этого символа - "+i1);



    }
}
