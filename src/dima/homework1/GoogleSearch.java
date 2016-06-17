package dima.homework1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by root on 5/11/16.
 */

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
//       String phrase = "";

        //Вызов Хрома
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("Hello World!");
        driver.findElement(By.id("sblsbb")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div[1]/div/h3/a")).click();
        Thread.sleep(2000);
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }

}
