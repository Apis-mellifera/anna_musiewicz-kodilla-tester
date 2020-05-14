package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //XPATH-Relative
        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));

        // XPATH-Position
        //WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        // uzywamy stworzonego obiektu klasy WebElement do utworzenia obiektu klasy Select
        Select yearSelect = new Select(yearCombo);
        //poistruowanie obiektu klasy Select by wybral z listy rozwijalnej poz. pod indeksem 5
        yearSelect.selectByIndex(5);

    }
}
