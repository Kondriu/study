package dima.lesson9;

import dima.lesson8.*;

/**
 * Created by dmitriy on 6/2/16.
 */
public class l9i2 {
    public static void main(String[] args) {
        dima.lesson8.Student student = new dima.lesson8.Student("egor"); // конструктов вызвающий класс, и передаетт парметры("egor")
        String response = student.getResponse("what is class?");
        System.out.println(response);

    }
}
