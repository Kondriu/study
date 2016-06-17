package dima.homework8.tested;

/**
 * Created by dmitriy on 6/2/16.
 */
public class FindSubstringIndex {
    public static void main(String[] args) {
        String str1 = "public static void main";
        String str2 = "sta";

        StringBuilder str = new StringBuilder(str1);
        System.out.println("string 1 = "+str);

        //узнаем индекс подстроки
        System.out.println("index = "+ str.indexOf("main"));
        System.out.println("lst index = "+str.lastIndexOf("gfk"));
    }
}
