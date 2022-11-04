package com.fleetApp.step_definitions;

import com.fleetApp.pages.LoginPage;
import com.fleetApp.pages.WarningMessagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWarningMessage_StepDefinition {

    LoginPage loginPage = new LoginPage();

    WarningMessagePage warningMessagePage = new WarningMessagePage();
    @When("The user tries to login with invalid {string} and {string} credentials")
    public void the_user_tries_to_login_with_invalid_and_credentials(String username, String password) {
    loginPage.loginWithCredentials(username, password);
    }
    @Then("{string} message should be displayed for invalid credentials")
    public void message_should_be_displayed_for_invalid_credentials(String expectedMessage) {

        String actualMessage = warningMessagePage.unableToSendTheEmail.getText();

        Assert.assertEquals("Message do not match", expectedMessage, actualMessage);
    }

    @Then("{string} message should be displayed for empty credentials")
    public void messageShouldBeDisplayedForEmptyCredentials(String expectedMessage) {

        Assert.assertEquals(expectedMessage, loginPage.fillOutWarningMessage());
    }
}
