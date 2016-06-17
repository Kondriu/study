package dima.lesson8;

/**
 * Created by dmitriy on 6/2/16.
 */
public class Student {              //имя класса
    private String name;            //пеерменная

    public Student (String name){   //конструктор
        this.name = name;

    }

    public Student(){               //другой конструктор
        this.name = "Vasya pipkin";

    }

    public String getResponse(String question){ // метожд
        return "what?";
    }
}
