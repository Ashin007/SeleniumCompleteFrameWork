package org.example.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalTime;

public class Base {

    public static ExtentReports extentReports;
    public static ExtentTest test;
    public ExtentTest extentTest;

    static ExtentSparkReporter sparkReporter;

    public WebDriver initializeDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ashin\\Documents\\APP Testing Version one\\SeleniumCompleteFrameWork\\chromedriver.exe");
        return new ChromeDriver();

    }

    public static ExtentReports getInstance(){


            sparkReporter = new ExtentSparkReporter("ExtentReport.html");
            sparkReporter.config().setTheme(Theme.STANDARD);
            sparkReporter.config().setDocumentTitle("MyReport");
            extentReports.attachReporter(sparkReporter);
            return extentReports;

    }

    @BeforeSuite
    public void setUp(){
        extentReports = new ExtentReports();
    }
    @AfterSuite
    public void tearDown(){
        extentReports.flush();
    }
    @AfterMethod(alwaysRun = true)
    public void getResult(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            test.pass(MarkupHelper.createLabel(result.getName()+"Test case Failed", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS){
            test.pass(MarkupHelper.createLabel(result.getName()+"Test case Passed", ExtentColor.GREEN));
        }
        else if(result.getStatus() == ITestResult.SUCCESS){
            test.skip(MarkupHelper.createLabel(result.getName()+"Test case Sipped", ExtentColor.GREEN));
            test.fail(result.getThrowable());
        }
    }
    @BeforeClass(alwaysRun = true)
    public void baseBeforeClass(ITestContext context){
        test = null;
        extentTest = getInstance().createTest(this.getClass().getName().replace("org.example.saucelabtestcases.",""));
    }
    @BeforeMethod(alwaysRun = true)
    public void baseBeforeMethod(Method method){
        test = this.extentTest.createNode(method.getName());
    }
    @AfterClass
    public void baseAfterClass(ITestContext context){

    }

    public String takeMyScreenshot(WebDriver driver) throws IOException {
        LocalTime time = LocalTime.now();
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./myScreenshot"+time.toString().replaceAll("[:,.]","")+".png");
        FileUtils.copyFile(src,dest);
        return dest.getAbsolutePath();
    }
}
