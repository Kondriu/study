package dima.lesson11;

import junit.framework.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by dmitriy on 6/9/16.
 */
@Listeners(MyTestListener.class)
public class UseListenerClass {
    WebDriver driver = new FirefoxDriver();

    @Test
   public void test1 (){

        driver.get("https://google.com");
        driver.close();

   }

}
