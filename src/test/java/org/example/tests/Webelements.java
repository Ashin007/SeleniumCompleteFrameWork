package org.example.tests;

import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Webelements extends Base {
    @Test
    public void test(){
        WebDriver driver = initializeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
    }
}
