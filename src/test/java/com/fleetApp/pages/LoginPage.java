package com.fleetApp.pages;

import com.fleetApp.utilities.ConfigurationReader;
import com.fleetApp.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //---locators----------------


    @FindBy(id = "prependedInput")
    private WebElement usernameField;

    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(id = "_submit")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeBox;

    //---methods-----------------

    public void inputVerify(String username) {

        Assert.assertEquals(username, usernameField.getAttribute("value"));
    }

    public void clickForgotPassword() {

        forgotPasswordLink.click();
    }

    public void goLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void loginAsDriver() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsSalesManager() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStoreManager() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsUserType(String userType) {

        String password = "";
        String username = "";

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }


    public void loginWithCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

    public void titleVerification(String expectedURLTitle) {

        Assert.assertEquals(expectedURLTitle, Driver.get().getTitle());

    }

    public void enterUsername() {

        String username = ConfigurationReader.get("driver_username");

        usernameField.sendKeys(username + Keys.ENTER);

    }

    public void enterPassword() {

        String password = ConfigurationReader.get("driver_password");
        passwordField.sendKeys(password + Keys.ENTER);

    }

    public String fillOutWarningMessage(){

        return usernameField.getAttribute("validationMessage");

    }
}

