package org.example.tests;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class GetAttributes extends Base {
    @Test
    public void test(){
        WebDriver driver = initializeDriver();
        driver.get("https://the-internet.herokuapp.com");

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for(WebElement element: elements){
            System.out.println(element.getText());
            System.out.println(element.getAttribute("href"));
            System.out.println("------------");

        }

    }
}
