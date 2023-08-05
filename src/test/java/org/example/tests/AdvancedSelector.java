package org.example.tests;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class AdvancedSelector extends Base {

    WebDriver driver;
    @Test
    public void myTest(){

        driver = initializeDriver();
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//        driver.findElement(By.id("username")).sendKeys("student");
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("Password123");
//        driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();

        driver.get("https://omayo.blogspot.com/");
//        WebElement serach = driver.findElement(By.name("q"));
//        serach.sendKeys("Hey");
//        driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(serach)).click();

        WebElement label = driver.findElement(By.xpath("//h2[@class='title' and text()='Buttons with same name attribute values']"));
        WebElement submit = driver.findElement(By.xpath("//button[@type='button' and text()='Submit']"));
        String loginText = driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(submit).below(label)).getText();
        System.out.println(loginText);

    }

}
