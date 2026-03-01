package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DiaryPage;

public class DiaryTest extends BaseTest {

    @Test
    public void verifyDiaryPage() {

        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");

        DiaryPage diary = new DiaryPage(driver);

        Assert.assertEquals(diary.getTotalEntries(), 10);
        Assert.assertEquals(diary.countGoodDreams(), 6);
        Assert.assertEquals(diary.countBadDreams(), 4);

        Assert.assertTrue(diary.validateDreamTypes());
        Assert.assertTrue(diary.validateAllColumnsFilled());
    }
}
