package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        while (!driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
        }
        driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();

        WebElement inputField = driver.findElement(
                By.xpath("//*[@name=\"string\"]")
        );
        inputField.sendKeys("mavic mini");
        inputField.submit();

        WebElement electronicsCombo = driver.findElement(
                By.xpath("//*[@data-role=\"header-wrapper\"]/div/div/div/div/form/div/div/select[1]")
        );
        Select electronicsSelect = new Select(electronicsCombo);
        electronicsSelect.selectByIndex(3);

        WebElement searchButton = driver.findElement(
                By.xpath("//*[@data-role=\"search-button\"]")
        );
        searchButton.click();

        driver.quit();
    }
}
