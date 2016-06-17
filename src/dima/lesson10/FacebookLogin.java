package dima.lesson10;

/**
 * Created by dmitriy on 6/6/16.
 */
public abstract class FacebookLogin extends  AbstractLogin {

    @Override
    public void openpage() {
        driver.get("https://facebook.com");
    }

    @Override
    public void login(String login, String password) {
       // super.login(login, password);
    }

    @Override
    public void typePassword(String password) {



    }

    @Override
    public void clickSubmit() {
    clickSubmit();
    }


}
