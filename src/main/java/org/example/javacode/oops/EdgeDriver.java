package org.example.javacode.oops;

public class EdgeDriver implements WebDriver{
    @Override
    public void getUrl() {
        System.out.println("get url from edge");
    }

    @Override
    public void getPageTitle() {
        System.out.println("get page title from edge");
    }

    @Override
    public void getCurrentUrl() {
        System.out.println("get current url from edge");
    }

    @Override
    public void close() {
        System.out.println("close firefox");
    }
}
