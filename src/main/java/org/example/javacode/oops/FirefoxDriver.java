package org.example.javacode.oops;

public class FirefoxDriver implements WebDriver{
    @Override
    public void getUrl() {
        System.out.println("get url from firefox");
    }

    @Override
    public void getPageTitle() {
        System.out.println("get page title from firefox");
    }

    @Override
    public void getCurrentUrl() {
        System.out.println("get current url from firefox");
    }

    @Override
    public void close() {
        System.out.println("close firefox");
    }
}
