package dima.lesson9;

/**
 * Created by dmitriy on 6/2/16.
 */
public class Student extends Person {
    private String university;
    private String response;
    private String group;
    //public String group;


    public Student(String name, String university) {
        super(name);
        this.university = university; //this -  то что будет вычисленно в этом методе - оно-же будет прирваненно и той глобальной
        // пеерменной, кторая обявлена в классе
    }

    public String getResponse(String question){
        return "че как ?";

    }

    public void setResponse(String response){
        this.response = response;
    }


    public String getGroup(String group){
        this.group = group;
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }
}