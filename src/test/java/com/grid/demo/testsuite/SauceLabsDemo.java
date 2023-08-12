package com.grid.demo.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Jay
 */
public class SauceLabsDemo {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "safari");
        caps.setCapability("platform", "macOS 13");
        caps.setCapability("version", "latest");
        caps.setCapability("build", "<your build id>");
        caps.setCapability("name", "<your test name>");
        caps.setCapability("username", "oauth-primecommunity102-4989b");
        caps.setCapability("accessKey", "*****9345");

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        driver = new RemoteWebDriver(url, caps);
    }

    @Test
    public void sauceLabTest() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("title of page is: " + driver.getTitle());
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
