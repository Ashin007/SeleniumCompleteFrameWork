package org.example.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    @Test
    public void myMainTest() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashin\\Documents\\APP Testing Version one\\SeleniumCompleteFrameWork\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("./myScreenshot.png"));

    }
}
