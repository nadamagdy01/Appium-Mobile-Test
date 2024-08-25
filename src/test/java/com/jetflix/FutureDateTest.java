package com.jetflix;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FutureDateTest extends TestBase {



    public void clickOnMenuFilter() {
     driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(2)")).click();
    }

    public void chooseReleaseDateFilter() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RadioButton\").instance(5)")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click();

    }

    public boolean verifyMoviesAreInTheFuture() {
        List<WebElement> movieReleaseDates = driver.findElements(By.xpath("//android.widget.TextView[2]"));
        LocalDate currentDate = LocalDate.now();

        for (WebElement releaseDateElement : movieReleaseDates) {
            String releaseDateString = releaseDateElement.getText();
            LocalDate releaseDate = LocalDate.parse(releaseDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            if(!releaseDate.isAfter(currentDate))
                return false;
        }
        return  true;
    }

    @Test
    public void testReleaseDateFilter() {
        clickOnMenuFilter();
        chooseReleaseDateFilter();
        verifyMoviesAreInTheFuture();
        Assert.assertTrue(verifyMoviesAreInTheFuture(), "Found a movie with a release date that is not in the future.");

    }


}
