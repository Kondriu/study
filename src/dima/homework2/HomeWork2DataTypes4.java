package dima.homework2;

import java.util.Scanner;

/**
 * Created by root on 5/18/16.
 */
public class HomeWork2DataTypes4 {

    public static void main(String[] args) {


        /*
        В переменной n хранится натуральное трёхзначное число.
        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
         */


        int q3;
        System.out.println("Введите трехзначное число");
        Scanner sc5 = new Scanner(System.in);
        q3 = sc5.nextInt();

        int reg0 = q3%10;
        int reg1 = (((q3-reg0)/10)%10);
        int reg2 = (((q3-reg0-reg1*10)/100)%10);

        System.out.println("введенное число состоит из:"+"\n"+reg2+", "+reg1+", "+reg0+"."+"\n Их сумма = "+(reg2+reg1+reg0));


    }
}
