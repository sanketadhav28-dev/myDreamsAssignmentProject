package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TotalPage {

    WebDriver driver;

    By goodDreams = By.id("goodDreams");
    By badDreams = By.id("badDreams");
    By totalDreams = By.id("totalDreams");
    By recurringDreams = By.id("recurringDreams");

    public TotalPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getGoodDreams() {
        return Integer.parseInt(driver.findElement(goodDreams).getText());
    }

    public int getBadDreams() {
        return Integer.parseInt(driver.findElement(badDreams).getText());
    }

    public int getTotalDreams() {
        return Integer.parseInt(driver.findElement(totalDreams).getText());
    }

    public int getRecurringDreams() {
        return Integer.parseInt(driver.findElement(recurringDreams).getText());
    }
}
