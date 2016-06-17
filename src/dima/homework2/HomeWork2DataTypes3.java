package dima.homework2;

import java.util.Scanner;

/**
 * Created by root on 5/18/16.
 */
public class HomeWork2DataTypes3 {
    public static void main(String[] args) {


        /*
        В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
         */


        System.out.println("Введите число, с дробной частью, для разделителя использовать ТОЧКУ");
        Scanner sc4 = new Scanner(System.in);
        float e2 = sc4.nextFloat();
        float q2 = Math.round(e2); // команда округления
        int w2 = (int) (q2); // переводим тип в INT  чтобы "потоерять" дробную часть, в котрой, 0 после предидущего действия
        System.out.println("число " +e2 +" округляется до: "+"\n"+(w2));


    }
}
