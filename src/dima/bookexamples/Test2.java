package dima.bookexamples;

/**
 * Created by dmitriy on 6/2/16.
 */
public class Test2 {
    int a,b;

    Test2(int i, int j){
        a = i;
        b = j;
    }
    //передать обьект
   public void meth(Test2 ob){
        ob.a *= 2;
        ob.b /= 2;
    }

    public void meth(int a, int b) {
    }
}

class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);
        System.out.println();

        System.out.println(" ob.a and ob.b before calling\t"+ob.a+" "+ob.b);
        ob.meth(ob.a, ob.b);
        System.out.println(" a and b after calling \t"+ob.a+" "+ob.b);
    }
}