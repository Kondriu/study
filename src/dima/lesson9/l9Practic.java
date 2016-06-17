package dima.lesson9;

/**
 * Created by dmitriy on 6/2/16.
 */
public class l9Practic {
    public  static void main (String [] args){

        Student student = new Student("Егор", "Goit");
        student.setResponse("this is coorect");
        String response = student.getResponse("What is class?");
        System.out.println(response);

        Teacher teacher = new Teacher("Ivan", "GoT");
        teacher.getResponse("What id Poli?");

    }
}
