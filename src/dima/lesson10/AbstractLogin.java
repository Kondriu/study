package dima.lesson10;

/**
 * Created by dmitriy on 6/6/16.
 */
public abstract class AbstractLogin extends MethodFacory{
// abstract - нельзя создать экземпляр - там только описано что-то
    public abstract void openpage();
    public abstract void typeLogin (String login);  // можно сипользовтаь для домашки
    public abstract void typePassword (String password);
    public abstract void clickSubmit ();


    public void login (String login, String password){
        openpage();
        typeLogin(login);
        typePassword(password);
        clickSubmit();

    }

}
