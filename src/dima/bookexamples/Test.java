package dima.bookexamples;

/**
 * Created by dmitriy on 6/2/16.
 */
public class Test {
    void  meth (int i, int j){
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main (String args []){
        Test ob = new Test();
        int a=15, b=20;
        System.out.println(" a and b before calling\t"+a+" "+b);
        ob.meth(a,b);
        System.out.println(" a and b after calling \t"+a+" "+b);
    }
}