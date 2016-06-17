package dima.lesson5;

/**
 * Created by root on 5/19/16.
 */
public class Lesson5ArraySort {

    public static void main(String[] args) {

  //     int n = 8;
 //       int mass [] = new int[n];
        int mass [] = {2, 4, 6, 8, 5, 3, 19, 9};
        int n = mass.length;
        int diff = 0;
        boolean t = true;

        for (int i=0; i<(n-1); i++) {
            //mass[i] = (int) (Math.floor(Math.random() * 29));
            System.out.print(mass[i] + " ");
            System.out.println(" ");
        }
        while (t = true){ //надо покурить дома - до конца не работает
            // скорее всего проверить скобки {}  - нверняка не туда вложил цикл.
            t=false;
            for (int j=0; j<(n-1); j++){
                if (mass[j] < mass[j+1]){
                    diff = mass[j];
                    mass[j]=mass[j+1];
                    mass[j+1] = diff;
                }
            }

        }

        for (int i=0; i<(n-1); i++){
            System.out.print(mass[i] + " ");
            System.out.println(" ");
        }
/*
                t=false;
                if (mass[i] > mass[i+1]){
                diff = mass[i];
                mass[i]=mass[i+1];
                mass[i+1] = diff;

            } else i++;
            t=true;
*/





    }

}
