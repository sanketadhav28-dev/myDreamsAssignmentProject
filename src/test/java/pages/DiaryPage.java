package pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiaryPage {

    WebDriver driver;

    By rows = By.xpath("//table[@id='dreamsDiary']//tbody//tr");

    public DiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getTotalEntries() {
        return driver.findElements(rows).size();
    }

    public int countGoodDreams() {
        return driver.findElements(
                By.xpath("//table[@id='dreamsDiary']//tbody//tr/td[3][text()='Good']"))
                .size();
    }

    public int countBadDreams() {
        return driver.findElements(
                By.xpath("//table[@id='dreamsDiary']//tbody//tr/td[3][text()='Bad']"))
                .size();
    }

    public boolean validateDreamTypes() {
        List<WebElement> types = driver.findElements(
                By.xpath("//table[@id='dreamsDiary']//tbody//tr/td[3]"));

        for (WebElement type : types) {
            String value = type.getText();
            if (!value.equals("Good") && !value.equals("Bad")) {
                return false;
            }
        }
        return true;
    }

    public boolean validateAllColumnsFilled() {
        List<WebElement> rowsList = driver.findElements(rows);

        for (WebElement row : rowsList) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement col : columns) {
                if (col.getText().trim().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Map<String, Integer> getRecurringDreams() {

        List<WebElement> names = driver.findElements(
                By.xpath("//table[@id='dreamsDiary']//tbody//tr/td[1]"));

        Map<String, Integer> countMap = new HashMap<>();

        for (WebElement name : names) {
            String dream = name.getText();

            countMap.put(dream, countMap.getOrDefault(dream, 0) + 1);
        }

        return countMap;
    }
}



