package io.smmok14.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TaskPage extends BaseClass{
   /* public By like = By.xpath("//div[contains(@id,'make_task_tabs')] //a[contains(@id,'like')]");
    public By tasksOfLikeSomth = By.xpath("//*[@id=\"make_task_tabs\"]/div[2]/div[4]/div[2]/div[4]/a");

    //div[contains(@class,'w150 left')]//a
    //div[contains(@class,'project_line line project998865')]//a[contains(@class,'button projectDetails')]");


    public TaskPage choseTaskPutLike() {
        WebElement buttonLike = DriverManager.getDriver().findElement(like);
        buttonLike.click();

        return  new TaskPage();
    }

    public TaskPage clickOnTheLinksI_likeIt(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement linksToThePage = DriverManager.getDriver().findElement(tasksOfLikeSomth);
        linksToThePage.click();


        return new TaskPage();
    }*/

   @FindBy(xpath = "//div[contains(@class,'tab-content tab-subscribe active')]")
    private List<WebElement> listsOfTaskFollow;

   @FindBy(xpath = "//*[@id=\"subscribe\"]")
   private WebElement follow;
   @FindBy(xpath = "//a[contains(@class,'button projectDetails')]")
   private WebElement taskFollows;
    @FindBy(xpath = "//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only')]")
    private WebElement alertGoToParticularPage;
    @FindBy(xpath = "//div[contains(@class,'ui-ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable ui-dialog-buttons dialog_status')]")
    private WebElement temp;

    public TaskPage goToFollowTasks(){
       follow.click();
       taskFollows.click();
       return new TaskPage();
   }
    public TaskPage clickButtonWatchTask(){

        taskFollows.click();

        return new TaskPage();
    }
    public TaskPage clickAlert(){
        alertGoToParticularPage.click();
        return new TaskPage();
    }





  /* public TaskPage following(){
       for(WebElement element : listsOfTaskFollow){
           element.findElement(By.xpath("//a[contains(@class,'button projectDetails')]")).click();
       }
       return new TaskPage();
   }*/

}