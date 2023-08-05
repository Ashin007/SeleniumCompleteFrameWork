package org.example.saucelabtestcases;

import org.example.base.Base;
import org.example.saucelabpageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class PurchaseProductTest extends Base {

    private WebDriver driver;
    LoginPage loginPage;
    @BeforeTest
    public void testInitializer(){
        driver = initializeDriver();
    }
    @Test
    public void purchaseMultipleProduct() throws IOException {
        loginPage = new LoginPage(driver);

        driver.get("https://www.saucedemo.com/");
        loginPage.loginUsingCredentials("performance_glitch_user","secret_sauce");

    }
}
