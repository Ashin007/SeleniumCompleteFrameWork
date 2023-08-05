package org.example.tests;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class KeepCurrentBrowserCloseOtherBrowser extends Base {
    @Test
    public void test(){
       WebDriver driver = initializeDriver();
       driver.get("https://the-internet.herokuapp.com/windows");
       driver.findElement(By.linkText("Click Here")).click();
       Set<String> windows = driver.getWindowHandles();
       String parentWindow = driver.getWindowHandle();
       for(String window:windows){
           if(!parentWindow.equalsIgnoreCase(window)){
               driver.switchTo().window(window);
               System.out.println("Window changed");
           }
       }
        String H3Text = driver.findElement(By.tagName("h3")).getText();
        System.out.println(H3Text);
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
    }
}
