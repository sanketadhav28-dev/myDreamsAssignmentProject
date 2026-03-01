package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By spinner = By.className("spinner");
    By mainContent = By.id("mainContent");
    By myDreamsBtn = By.id("dreamButton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSpinnerDisplayed() {
        return driver.findElement(spinner).isDisplayed();
    }

    public boolean isMainContentVisible() {
        return driver.findElement(mainContent).isDisplayed();
    }

    public boolean isMyDreamsVisible() {
        return driver.findElement(myDreamsBtn).isDisplayed();
    }

    public void clickMyDreams() {
        driver.findElement(myDreamsBtn).click();
    }
}
