package com.isortegah.framework.libs.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BrowserDriver {

    private static final Logger logger = LogManager.getLogger();
    private static long threadId;
    private static WebDriver webDriver;

    public BrowserDriver(String browser) {
        logger.info("open browser on thread : " + threadId );
        webDriver = WebDriverFactory.createWebDriver(browser);
    }

    public static void open(String url){
        //webDriver.get(url);
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public void close() {
        webDriver.close();
    }
}
