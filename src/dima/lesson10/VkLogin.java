package dima.lesson10;

/**
 * Created by dmitriy on 6/6/16.
 */
public class VkLogin extends AbstractLogin{

    public void loginAny (AbstractLogin login){
        login.login("login","pass");


/*    AbstractLogin login = new VkLogin();
    login.login("jo","fiii");*/


    }

    @Override
    public void openpage() {

    }

    @Override
    public void typeLogin(String login) {

    }

    @Override
    public void typePassword(String password) {

    }

    @Override
    public void clickSubmit() {

    }
}
