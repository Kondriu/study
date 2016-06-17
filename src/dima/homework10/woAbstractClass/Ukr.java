package dima.homework10.woAbstractClass;

/**
 * Created by dmitriy.k on 09.06.16.
 */
public class Ukr extends AbstractHuman{

    public static void Hello () {

        AbstractHuman ukr = new AbstractHuman();
        ukr.setHelloword("Превед");
        ukr.setImword("Я");
        ukr.setName("Дима");

        ukr.say();

    }


}
