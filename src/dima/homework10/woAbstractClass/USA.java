package dima.homework10.woAbstractClass;

/**
 * Created by dmitriy.k on 09.06.16.
 */
public class USA extends AbstractHuman{
    public static void Hello() {
        AbstractHuman us = new AbstractHuman();

        us.setName("Jon");
        us.setImword("I'm");
        us.setHelloword("hello");

        us.say();
    }
}
