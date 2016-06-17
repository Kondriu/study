package dima.lesson9;

/**
 * Created by dmitriy on 6/2/16.
 */
public class l9i3 {
    public static void main(String[] args) {





        Student student = new Student("dima", "KPI");
        System.out.println(student.getGroup("23-a"));

/*
       String response = Student.getResponse("What ?");
        System.out.println(response);

        System.out.println(student.getResponse());*/




    }

    private String response;
    public String getResponse(String question) {
        response = question + "yes";

        if ((question != null) && (!question.equals("")))
        return response;
        else
        return "no qest";
    }



}
