package dima.lesson11;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by dmitriy on 6/9/16.
 */
public class l11i2 {

    @Test
    @Parameters({"email", "password"})

    public void loginTest (String email, String password) {
        System.out.println(email+", "+password);
        //Assert.assertTrue();
        //login(email, password);


    }

}
