package dima.lesson3;



import dima.lesson3.ClassWithConstant;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by root on 5/12/16.
 */

    // мы тестировщики не пишем программы - мы пишем тесты:
    //будем учить

public class TestNgProg {

  //  public static final double PI=3.14; //заали константу, которая меняться не может - final

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();



        double area = ClassWithConstant.PI*r*r; //значение константы вытягиваем из дргого класса "ClassWithConstant" кторый в другом пакете
        System.out.println(ClassWithConstant.ERROR_MSG);

        System.out.println("площадь круга");
        System.out.println(area);



    }







}
