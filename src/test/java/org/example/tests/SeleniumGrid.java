package org.example.tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class SeleniumGrid {
    public WebDriver driver;
    public DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    @Parameters({"Browser"})
    @Test
    public void test(String browser) throws MalformedURLException {
        if(browser.equals("MicrosoftEdge")){
            desiredCapabilities.setPlatform(Platform.ANY);
            desiredCapabilities.setBrowserName("MicrosoftEdge");
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.merge(desiredCapabilities);
        }
        else if(browser.equals("chrome")){
            desiredCapabilities.setPlatform(Platform.ANY);
            desiredCapabilities.setBrowserName("chrome");

            ChromeOptions options = new ChromeOptions();
            options.merge(desiredCapabilities);
        }


        driver = new RemoteWebDriver(new URL("http://localhost:4444"),desiredCapabilities);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
