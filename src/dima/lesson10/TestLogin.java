package dima.lesson10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by dmitriy on 6/6/16.
 */
public class TestLogin extends BrowserFactory{
//

    By button = By.xpath(".//*[@id='content']/div/div/div/div/div[1]/div/div[1]/img");
    By button2 = By.xpath(".//*[@id='blueBarDOMInspector']/div[1]/div/div/div/div[1]/div[1]/h1/a/span");

    @Test
    public void tRyTest() { // это не тест, а тестовый метод. т.е. сущность меньше чем просто тест
        System.out.println("This is @Test");
        driver.get("https://google.com");

    }

    @Test
    public void tRyTest2() {
        System.out.println("This is @Test2");
        driver.get("https://facebook.com");
        boolean isButtonPresent = isElementPresent(button, 10);
        System.out.println("элемент  -"+isButtonPresent);
        boolean isXrenjPresent = isElementPresent(button2, 10);
        System.out.println("shit is - "+isXrenjPresent);


    }

    @Test
    public void tryLogin(){
        AbstractLogin login = new FacebookLogin() {
            @Override
            public void typeLogin(String login) {
                System.out.println("");//просто чтобы не было красного
            }
        };
        login.login("vasya","pass");
    }
}