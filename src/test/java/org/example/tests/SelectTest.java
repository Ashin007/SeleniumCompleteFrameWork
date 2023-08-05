package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectTest {

    @Test
    public void myMainTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashin\\Documents\\APP Testing Version one\\SeleniumCompleteFrameWork\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Select select = new Select(driver.findElement(By.tagName("select")));
        List<WebElement> elements = select.getOptions();
        System.out.println(elements.size());
        select.selectByIndex(23);
        for(WebElement ele:elements){
            System.out.println(ele.getText());
        }
        //driver.findElement(By.id("id")).
        //assert driver.findElement(By.id("id")).isDisplayed();
        
    }
}
