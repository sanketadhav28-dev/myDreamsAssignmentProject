package tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DiaryPage;
import pages.TotalPage;

public class TotalTest extends BaseTest {

    @Test
    public void verifyTotalPage() {

        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");

        DiaryPage diary = new DiaryPage(driver);

        Map<String, Integer> recurring = diary.getRecurringDreams();

        int recurringCount = 0;

        for (int value : recurring.values()) {
            if (value > 1) {
                recurringCount++;
            }
        }

        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");

        TotalPage total = new TotalPage(driver);

        Assert.assertEquals(total.getGoodDreams(), 6);
        Assert.assertEquals(total.getBadDreams(), 4);
        Assert.assertEquals(total.getTotalDreams(), 10);
        Assert.assertEquals(total.getRecurringDreams(), recurringCount);

        Assert.assertTrue(recurring.containsKey("Flying over mountains"));
        Assert.assertTrue(recurring.containsKey("Lost in maze"));
    }
}
