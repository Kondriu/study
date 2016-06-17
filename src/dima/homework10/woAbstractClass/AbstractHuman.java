package dima.homework10.woAbstractClass;

/**
 * Created by dmitriy.k on 09.06.16.
 */
public class AbstractHuman {
    protected String name;
    protected String imword;
    protected String helloword;

    protected void say() {
        System.out.println(helloword+", "+imword+" "+name);
    }
    protected void setName (String n){
        name = n;
    }

    protected void setImword(String i){
        imword = i;
    }

    protected  void setHelloword(String h){
        helloword = h;
    }

}
