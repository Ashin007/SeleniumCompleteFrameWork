package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumManagerSample {

    @Test
    public void myTest(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

    }
}
