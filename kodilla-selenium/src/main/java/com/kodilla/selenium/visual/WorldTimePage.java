package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.WebDriver;

//tworzę klasę, która reprezentuje stronę internetową
@Snap("WorldTime.png")
public class WorldTimePage {

    private static final String pageURL = "https://www.worldtimeserver.com/current_time_in_AW.aspx";

    private WebDriver webDriver;

    //przekazuję obiekt webdriver do konstruktora klasy
    //daje to obiektom reprezentującym strony internetowe dostęp do przeglądarki
    public  WorldTimePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get(pageURL);
    }

    public void close() {
        webDriver.quit();
    }

    //używając konfiguracji zapisanej w tej klasie stwarzam zrzut ekranu używając aktualnie otwartej strony
    // i porównuję go do punktu odniesienia
    public void compare() {
        Ocular.snapshot()
                .from(this)
                .sample().using(webDriver)
                .compare();
    }

}
