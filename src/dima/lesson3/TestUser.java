package dima.lesson3;

import org.testng.annotations.Test;

/**
 * Created by root on 5/12/16.
 */
public class TestUser {

    @Test
    public void CreateUsers(){

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "Masha";
        user1.email = "ololo@mail.com";
        user1.age = 10;

        user2.name = "ala";
        user2.email = "ala@mail.com";
        user2.age = 12;

        user3.name = "kola";
        user3.email = "kola@mail.com";
        user3.age = 16;


        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user3.name);


    }
}
