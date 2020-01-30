package io.smmok14.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseClass{

/*    public By enterByVk = By.xpath("//*[@id=\"uLogin\"]/a");*/
    @FindBy(xpath = "//a[contains(@x-ulogin-button,'vkontakte')]")
   private WebElement enterByVk;

    public VkLogIN enterByVkontakte() {
       enterByVk.click();

        return new VkLogIN();
    }
}
