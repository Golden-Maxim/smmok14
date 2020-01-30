package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private  static  WebDriver driver;
    private DriverManager(){}

    public static WebDriver getDriver(){
        if (driver == null) {
            Proxy proxy = new Proxy();

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--proxy-server=socks5://77.121.98.107:9100");
            options.addArguments("start-maximized");

            capabilities.setCapability(ChromeOptions.CAPABILITY, options);

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();



        }
        return driver;
    }
    public static void navigateTo(String url){
        getDriver().get(url);
    }

    public static void killDriver(){
        driver.close();
        if (driver != null){
            driver = null;
        }

    }


}
