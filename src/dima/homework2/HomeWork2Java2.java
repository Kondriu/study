package dima.homework2;

import java.util.Scanner;

/**
 * Created by root on 5/18/16.
 */
public class HomeWork2Java2 {
    public static void main(String[] args) {

/*
        Convert variables of different types. int->char, float->char, float->char->int. Check what will happen.

        Считывание из консоли int - переобразование в символ. Вывести на экран соответствующий символ
        Считывание из консоли float - переобразование в символ. Вывод на экран
        Считывание из конслои float - Переобразование в char и int - Вывести на экран int.
*/



        System.out.println("Введите цифровой код сивола:");
        Scanner sc2 = new Scanner(System.in);
        int i2 = sc2.nextInt(); //

        char ch2 = (char) i2;  // - просто приравнять переменную INT, как в примере "char symb1=1067;" не годится
        System.out.println("вы вели: \'"+i2+"\' цифровой код символа - \'"+ch2+"\'");

        Scanner sc3 = new Scanner(System.in);
        float f2 = sc3.nextFloat();
        char ch2f = (char) f2;
        System.out.println("вы вели: \'"+f2+"\' цифровой код символа - \'"+ch2f+"\'");


        Scanner sc4 = new Scanner(System.in);
        float f22 = sc4.nextFloat();
        char ch2f2 = (char) f22;
        int i3 = (int) f22;
        System.out.println("вы вели: \'"+f22+"\' цифровой код символа - \'"+ch2f2+"\'"+"");



    }
}
