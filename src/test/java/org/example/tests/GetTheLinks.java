package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class GetTheLinks {
    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[2][2];
        data[0][0] = "Ashin";
        data[0][1] = "Vijayan";
        data[1][0] = "Suvarna";
        data[1][1] = "Ashna";

        return data;

    }

    @Parameters({"browser"})
    @Test(groups = "smoke")
    public void test(String browser){

        System.out.println(browser);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.credosystemz.com/cts-selenium-interview-questions/");
        List<WebElement> listOfElements = driver.findElements(By.tagName("a"));
        for(WebElement element:listOfElements){
            System.out.println(element.getAttribute("href"));
        }
    }
    @Test(dataProvider = "getData",groups = "regression")
    public void testTwo(String firstname,String lastname ){
        System.out.println(firstname+lastname);
    }
}
