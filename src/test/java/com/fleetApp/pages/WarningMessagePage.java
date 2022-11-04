package com.fleetApp.pages;

import com.fleetApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WarningMessagePage {

    public WarningMessagePage(){

        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//button[@class='btn extra-submit btn-uppercase btn-primary']")
    public WebElement requestButton;

    @FindBy(xpath = "//div[@class='alert alert-warn']")
    public WebElement unableToSendTheEmail ;
}
