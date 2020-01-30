package io.smmok14;

import io.smmok14.PageObject.MainPage;
import io.smmok14.PageObject.TaskPage;
import io.smmok14.PageObject.VkLogIN;
import org.junit.Test;
import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SmmokRun {
    @Test
    public void smmokRun(){
        DriverManager.getDriver();
        DriverManager.navigateTo("https://smmok14.ru/");
        new MainPage()
                .enterByVkontakte()
                .fillTheFormVk().goToFollowTasks().clickButtonWatchTask().clickAlert();


    }
}
