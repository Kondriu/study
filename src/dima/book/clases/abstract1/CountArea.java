package dima.book.clases.abstract1;

/**
 * Created by dmitriy on 6/11/16.
 */
public class CountArea {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;

        Triangle fif = new Triangle(a,b);
//        fif.dim1 = 4;
//        fif.dim2 = 5;
        fif.printArea();
    }
}
