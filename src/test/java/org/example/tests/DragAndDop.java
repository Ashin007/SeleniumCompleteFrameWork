package org.example.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.example.base.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class DragAndDop extends Base {
    WebDriver driver;
    ExtentReports extentReports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/Sparks.html");

    @BeforeTest
    public void testStart(){


        driver = initializeDriver();
    }
    @Test
    public void test() throws IOException {
        ExtentTest test = extentReports.createTest("Zero Test").assignAuthor("Ashin").assignCategory("Functional Test Case")
                .assignDevice("Windows-11");

        test.info("Test Zero started");

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver)).build());

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable).build()
                .perform();
        test.pass("Test Zero passed");



    }
    @AfterTest
    public void flush(){

        extentReports.flush();
        driver.quit();
    }
    @Test
    public void test1() throws IOException {
        ExtentTest test = extentReports.createTest("First Test").assignAuthor("Ashin").assignCategory("Functional Test Case")
                        .assignDevice("Windows-11");

        test.info("Test one started");

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable).build()
                .perform();

        test.fail("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver)).build());

    }

    public String takeScreenshot(WebDriver driver) throws IOException {
        LocalTime time = LocalTime.now();
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./myScreenshot"+time.toString().replaceAll("[:,.]","")+".png");
        FileUtils.copyFile(src,dest);
        return dest.getAbsolutePath();
    }
}
