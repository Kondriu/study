package dima.homework2;

import java.util.Scanner;

/**
 * Created by dmitriy on 17.05.16.
 */
public class HomeWork2DataTypes1 {
    public static void main(String[] args) {

        /*
        В переменных q и w хранятся два натуральных числа.
        Создайте программу, выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
                21 / 8 = 2 и 5 в остатке
         */


        int q,w,z,x,c;

        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        q = sc1.nextInt();

        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        w = sc2.nextInt();

        x=q/w; // здесь получается результат простого деления, но т.к. тип INT - то дробная (десятичная) часть потеряется
        c=q%w; // "деление по модулю" я пока не понял точно, но похоже результат получится остаток от деления. "5/2 = (4/2 + 1) = 2(и 1 остаток)"

        System.out.println("Результат деления первого числа на второе = "+x+" и "+c+" в остатке");



    }
}
