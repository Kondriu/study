package dima.lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by dmitriy on 6/6/16.
 */
public class BrowserFactory extends  MethodFacory{

   // public static WebDriver driver; // static - чтобы не создавать экземпляры вебдрайвера


    //@BeforeMethod
    @BeforeTest
    public void setUpBrowser(){
        System.out.println("Run Before Test");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println("driver is up");

    }



   // @AfterMethod
    @AfterTest
    public void tearDown(){
        System.out.println("Run After Test");
        driver.quit();
        System.out.println("close rowser");

    }





}
