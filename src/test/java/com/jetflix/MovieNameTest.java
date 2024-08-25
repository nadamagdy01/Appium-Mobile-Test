package com.jetflix;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MovieNameTest extends TestBase {

    public void clickOnMovie(String movieName) {
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + movieName + "']")).click();
    }

    public String getMovieNameFromScreen( ) {

        return driver.findElement(By.xpath("(//android.view.View//android.widget.ScrollView//android.widget.TextView)[1]")).getText();
    }

    public void verifyMovieName(String expectedMovieName) {
        String actualMovieName = getMovieNameFromScreen();
        Assert.assertEquals(actualMovieName, expectedMovieName, "Movie name on the movie screen does not match the expected name.");
    }


    @Test
    public void testMovieNameVerification() {
        String movieName = "Deadpool & Wolverine";
        clickOnMovie(movieName);
        verifyMovieName(movieName);
    }

}

