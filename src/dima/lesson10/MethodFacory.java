package dima.lesson10;

import org.openqa.jetty.html.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by dmitriy on 6/6/16.
 */
public class MethodFacory{

    public static final int DEFAULT_WAIT_TIME = 30;
    public static WebDriver driver;
    public String currentBrowser;



    public boolean isElementPresent (By by, int sec){
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS); // выстаили ожидание элемента на странице
        List<WebElement> elementList = driver.findElements(by); // полоучили список элементов
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, TimeUnit.SECONDS); //
        return elementList.size()>0;




    }



}
