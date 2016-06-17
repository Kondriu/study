package dima.book.clases.abstract1;

/**
 * Created by dmitriy on 6/11/16.
 */
abstract public class Figure {

    //переменные
    double dim1;
    double dim2;

    //конструктор
    Figure (double a, double b){
        dim1 = a;
        dim2 = b;
    }

    //обявим абстрактный метод
    abstract double area ();

}
