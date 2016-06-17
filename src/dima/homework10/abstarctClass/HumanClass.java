package dima.homework10.abstarctClass;

/**
 * Created by dmitriy on 6/7/16.
 * Создайте абстрактный класс Человек,
 * пусть там будет свойство Имя и абстрактный метод СказатьПриветствие(),
 * от этого класса будет несколько наследников,
 * которые представляют национальность (русский, украинец, американец...).
 * Должно получиться так, что при вызове методаСказатьПриветствие()
 * выводилось приветствие на языке соответствующему национальности
 * (Привет, Привіт, Hi...).
 */

public abstract class HumanClass {
    protected String name;
    protected String imword;
    protected String helloword;

    protected void sayHello() {
        System.out.println(helloword+", "+imword+" "+name);
    }
    protected void setName(String n){
        name = n;
    }
    protected void setImword(String i){
        imword = i;
    }
    protected void setHelloword (String h){
        helloword = h;
    }

}
