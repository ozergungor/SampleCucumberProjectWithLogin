package com.fleetApp.pages;

import com.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){

        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="prependedInput")
    public WebElement usernameField;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement requestBtn;

}