package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ImplicitAndExplicitWait {

    @Test
    public void myMainTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashin\\Documents\\APP Testing Version one\\SeleniumCompleteFrameWork\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        driver.findElement(By.id("button00")).click();
        System.out.println("clicked on start button");
        driver.findElement(By.id("button01")).click();
        System.out.println("clicked on button one");
        WebElement buttonTwo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("button02")));
        buttonTwo.click();

        System.out.println("clicked on button two");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("button03")).click();
    }
}
