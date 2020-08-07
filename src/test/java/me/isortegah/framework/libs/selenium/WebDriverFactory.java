package me.isortegah.framework.libs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverFactory {

    public WebDriverFactory(){

    }

    public static WebDriver createWebDriver(String wDriver) {
        String webdriver;
        if (wDriver != null)
            webdriver = wDriver;
        else
            webdriver = System.getProperty("browser", "chrome");
        switch(webdriver) {
            case "firefox":
                return getFirefoxDriver();
            case "chrome":
                return getChromeDriver();
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chrome/linux/chromedriver");
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/firefox/linux/geckodriver");
        System.setProperty("webdriver.firefox.marionette","src/test/resources/drivers/firefox/linux/geckodriver");
        System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");

        System.setProperty("webdriver.firefox.marionette","true");

        FirefoxOptions options = new FirefoxOptions()
                .setProfile(new FirefoxProfile());
        return new FirefoxDriver(options);
    }


}
