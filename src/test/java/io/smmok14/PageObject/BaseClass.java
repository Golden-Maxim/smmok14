package io.smmok14.PageObject;

import core.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    public BaseClass(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }
}
