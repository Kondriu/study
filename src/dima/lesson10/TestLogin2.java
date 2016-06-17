package dima.lesson10;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by dmitriy on 6/6/16.
 */
public class TestLogin2 extends BrowserFactory{

    @DataProvider (name = "stinga")
    public Object[][] Strings(){
        return new Object [][] {
                {"1"},
                {"2"},
                {"3"},
                {"4"},
        };
    }

    @DataProvider (name = "Loginpages")
    public Object[][] loginPages(){
        return new Object [][] {
                {new VkLogin()},
                {new FacebookLogin() {
                    @Override
                    public void typeLogin(String login) {
                        driver.findElements(By.id("mmksdflkjsdsd")).clear();
                    }
                }},
        };
    }


    @Test (dataProvider = "Loginpages")
    public void tryLoginPages(AbstractLogin login){
        login.login("user","pass");
    }
}
