package dima.lesson7;

import java.util.Scanner;

/**
 * Created by root on 5/26/16.
 */
public class lesson7i3 {
    public static void main(String[] args) {

    // tесть строка нормально
        /// покурить дома

        String firstStr = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789 ";
        String secndStr = "1QAZ2WSX3EDC4RFV5TGB6YHN7UJM8IK9OL0P qazwsxedcrfvtgbyhnujmikolp";

      //  String.charAt();


        StringBuilder bldr = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        for (int i =0; i<firstStr.length(); i++)
        {
            bldr.setCharAt(i, secndStr.charAt(i)); // задали индексс какого начинать заменять

        }
        System.out.println(bldr);





    }
}
