package io.smmok14.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VkLogIN extends BaseClass{

  @FindBy(xpath = "//div[contains(@class,'oauth_form_login')] //input[contains(@type,'text')]")
  private WebElement login;
  @FindBy(xpath = "//div[contains(@class,'oauth_form_login')] //input[contains(@type,'password')]")
  private WebElement password;
  @FindBy(xpath = "//div[contains(@class,'g960')]//a[1]")
  private WebElement getMoneyByVk;


    public  TaskPage fillTheFormVk(){

        String mainWindow = DriverManager.getDriver().getWindowHandle();
        for(String winHandle : DriverManager.getDriver().getWindowHandles()){
            DriverManager.getDriver().switchTo().window(winHandle);
        }

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'oauth_form_login')] //input[contains(@type,'text')]")));
        login.click();
        login.sendKeys("79159690371");

        password.click();
        password.sendKeys("NekoTyan2008",Keys.ENTER);

        DriverManager.getDriver().switchTo().window(mainWindow);
        getMoneyByVk.click();


        WebElement alert = DriverManager.getDriver().findElement(By.xpath("/html/body/div[4]/div[11]/div/button/span"));
        alert.click();

        return new TaskPage();
    }

}
