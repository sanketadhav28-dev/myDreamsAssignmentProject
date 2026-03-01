package tests;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        HomePage home = new HomePage(driver);

        Assert.assertTrue(home.isSpinnerDisplayed());

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                org.openqa.selenium.By.className("spinner")));

        Assert.assertTrue(home.isMainContentVisible());
        Assert.assertTrue(home.isMyDreamsVisible());

        String parent = driver.getWindowHandle();

        home.clickMyDreams();

        Set<String> allWindows = driver.getWindowHandles();

        Assert.assertEquals(allWindows.size(), 3);

        for (String window : allWindows) {
            driver.switchTo().window(window);
        }
    }
}
