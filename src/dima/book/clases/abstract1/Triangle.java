package dima.book.clases.abstract1;

/**
 * Created by dmitriy on 6/11/16.
 */
public class Triangle extends Figure {
    Triangle(double a, double b){
        super (a,b);
    }
    public  static  void setDim1 (String a){

    }
    //переопределяем метод
    double area() {
        return ((dim1*dim2)/2);
    }

    public void printArea (){
        System.out.println(area());
    }
}
