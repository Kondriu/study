package dima.lesson11;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by dmitriy on 6/9/16.
 */
public class l11i3 {
    @Test
    @Parameters({"email", "password"})

    public void loginTest(@Optional("my@email.com") String email, @Optional("qweqwr") String password) {
        System.out.println(email+", "+password);

    }

    @Test(priority = 1)
    public void test1(){

    }

    @Test(priority = 3)
    public void test2(){

    }

    @Test(enabled = false)
    public void test3 (){

    }

    @Test
    public void test4 () {
        throw new NoSuchElementException("No such element");
    }

    @Test(invocationCount = 100)
    public void test5 (){

    }
    @Test(dependsOnMethods = "test2", alwaysRun = true)
    public void bTest (){

    }
    @Test
    public void bTest1 (){
        Assert.fail();    //просто завалить тест

    }

}
