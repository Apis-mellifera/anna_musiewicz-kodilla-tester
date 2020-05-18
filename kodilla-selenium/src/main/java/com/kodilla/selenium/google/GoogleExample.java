package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {

        //ustawiamy wartość własciwości systemowej tak by wskazywała gdzie na dysku znajduje sie sterownik do przeglądarki
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");

        //tworzymy obiekt WebDriver - interfejs z biblioteki Selenium. obiekt reprezentuje jedno otwarte okno przeglądarki
        // ChromeDriver to implementacja klasy WebDriver
        WebDriver driver = new ChromeDriver();

        //polecenie otwarccia strony o wskazanym adresie, musi byc pełny adres URL
        driver.get("https://www.google.com");

        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");
        inputField.submit();

        driver.quit();
    }
}
