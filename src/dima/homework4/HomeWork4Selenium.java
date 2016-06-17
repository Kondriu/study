package dima.homework4;

import com.google.common.primitives.Ints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by root on 5/19/16.
 */
public class HomeWork4Selenium {
    public static void main(String[] args) throws InterruptedException {
        int max = 5;
/*
Зайти на http://www.imdb.com/
Перейти на страницу с Top 250 фильмов
Вывести в консоль "Название фильма + оценку"
Вывести в консоль самый старый фильм (год выпуска)
Вывести в консоль самый новый фильм из этого рейтинга
*/
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.imdb.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath(".//*[@id='navTitleMenu']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(".//*[@id='navMenu1']/div[2]/ul[1]/li[6]/a")).click();
        Thread.sleep(2000);

        ArrayList movieNamesList = new ArrayList();
        ArrayList movieYearsList = new ArrayList();
        ArrayList movieRatesList = new ArrayList();

        //String nameOfMovie="";
        for (int i=0; i<max; i++){
            WebElement movie = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/a"));
// WebElement elementBy = driver.findElement(By.xpath(".//*[@id='selectByPB']/tr[3]/td[2]"));
// String privatbankBuyUSD = elementBy.getText(); //надо поискать как сразу число получить
            String nameOfMovie = movie.getText();
            movieNamesList.add(i,nameOfMovie);
            WebElement year = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/span"));
            String yearOfMovieStr = year.getText().substring(1,5);
            double yearOfMovieD = new Double(yearOfMovieStr);
            int yearOfMovie = (int) yearOfMovieD;
            movieYearsList.add(i,yearOfMovie);

            WebElement rate = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[3]/strong"));
            String rateOfMovieStr = rate.getText();
            double rateOfMovie = new Double(rateOfMovieStr);
            movieRatesList.add(i,rateOfMovie);
//            System.out.println((i+1)+" \t "+"\""+movieNamesList.get(i)+"\",\t\t"+movieYearsList.get(i)+""+"\t"+movieRatesList.get(i));
            System.out.println((i+1)+" \t "+"\""+movieNamesList.get(i)+"\t"+movieRatesList.get(i));
        }


        int[] ints = Ints.toArray(movieYearsList);
        Arrays.sort(ints);

        for (int i =0; i<max; i++){
            if (ints[0]==movieNamesList.get(i)){
                System.out.println("Самый старый:"+movieNamesList.get(i)+"\t"+movieYearsList.get(i));
            }else break;
        }

        for (int i =0; i<max; i++){
            if (ints[max-1]==movieNamesList.get(i)){
                System.out.println("Самый новый:"+movieNamesList.get(i)+"\t"+movieYearsList.get(i));
            } else break;
        }

















        driver.close();
    }
}