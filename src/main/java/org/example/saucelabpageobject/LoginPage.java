package org.example.saucelabpageobject;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends Base {

    public WebDriver driver;

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By login = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginUsingCredentials(String userName,String passWord) throws IOException {
        driver.findElement(username).sendKeys(userName);
        test.info("Username entered on username filed");
        driver.findElement(password).sendKeys(passWord);
        test.info("password entered on password filed");
        driver.findElement(login).click();
        test.pass("Clicked on Login button", MediaEntityBuilder.createScreenCaptureFromPath(takeMyScreenshot(driver)).build());
    }

}
