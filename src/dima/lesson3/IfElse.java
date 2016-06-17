package dima.lesson3;


import static dima.lesson3.ClassWithConstant.PI;

/**
 * Created by root on 5/11/16.
 */

public class IfElse {

    public static void main(String[] args) throws InterruptedException {

        int a = 4;
        int b = 5;
        boolean result;
        result = a == b; // a равно b - false
        result = a != b; // a не равно b - true
        result = a < b; // a меньше b - true
        result = a > b; // a больше b - false
        result = a <= 4; // a меньше или равно 4 - true
        result = b >= 6; // b больше или равно 6 - false
        result = a > b || a < b; // (a больше b) логическое или (a меньше b) - true
        result = 3 < a && a < 6; // (3 меньше a) логическое и(a меньше 6) - true

        result = !result; // логическое не - false


        String str1 = new String("hello");

        if(a==b) {
            System.out.println("a и b равны");
        }
        else {
            System.out.println("a и b не равны!");
        }

            //есть сокращенный варинат
        System.out.println(a==b ? "a и b равны!" : "a и b не равны!");

    }

}
