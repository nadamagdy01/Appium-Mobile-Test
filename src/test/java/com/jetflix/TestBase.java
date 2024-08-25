package com.jetflix;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    AndroidDriver driver;

    @BeforeMethod
    public void setup()    {

        UiAutomator2Options caps = new UiAutomator2Options();

        caps.setPlatformName( "Android");
        caps.setDeviceName( "Nada Magdy");
        caps.setUdid( "RZCRA0C8XSL");
        caps.setPlatformVersion( "12");
        caps.setAppPackage("com.yasinkacmaz.jetflix.debug");
        caps.setAppActivity( "com.yasinkacmaz.jetflix.ui.main.MainActivity");

        try{
            driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        catch (Exception exp)
        {
            System.out.println("Cause is: " + exp.getCause());
          System.out.println("Message is: "+ exp.getMessage());           
          exp.printStackTrace();
        }
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
