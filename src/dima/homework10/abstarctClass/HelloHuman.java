package dima.homework10.abstarctClass;

/**
 * Created by dmitriy on 6/8/16.
 */
public class HelloHuman extends HumanClass {
    public static void main(String[] args) {

        UkrHuman ukr = new UkrHuman();
        UsaHuman pen = new UsaHuman();
        ukr.setHelloword("ПТН-ПНХ");
        ukr.setName("Вуйко");
        ukr.setImword("Йа");
        pen.setImword("I`m");
        pen.setHelloword("Hi");
        pen.setName("Jimmy");

        System.out.println("Укр скажет:");
        ukr.sayHello();
        System.out.println("Пендос скажет:");
        pen.sayHello();
    }

}
