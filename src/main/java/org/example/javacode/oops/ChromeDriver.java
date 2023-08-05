package org.example.javacode.oops;

public class ChromeDriver extends BrowserAction implements WebDriver{
    @Override
    public void getUrl() {
        System.out.println("get url from chrome");
    }

    @Override
    public void getPageTitle() {
        System.out.println("get page title from chrome");
    }

    @Override
    public void getCurrentUrl() {
        System.out.println("get current url from chrome");
    }

    @Override
    public void close() {
        System.out.println("close firefox");
    }

    @Override
    public void exitBrowser() {
        System.out.println("exiting from browser");
    }
}
