package com.fleetApp.step_definitions;

import com.fleetApp.pages.ForgotPasswordPage;
import com.fleetApp.pages.LoginPage;
import com.fleetApp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPasswordPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("The user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {

        loginPage.clickForgotPassword();
    }
    @Then("User lands on the {string} page")
    public void userLandsOnThePage(String expectedResult) {

        loginPage.titleVerification(expectedResult);
        System.out.println(expectedResult);
        System.out.println(Driver.get().getTitle());

    }

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @And("The user enters own username")
    public void theUserEntersOwnUsername() {

        forgotPasswordPage.usernameField.sendKeys("user1");

    }
    @And("The user clicks Request Btn")
    public void theUserClicksRequestBtn() {

        forgotPasswordPage.requestBtn.click();
    }
    @Then("The user should get email")
    public void theUserShouldGetEmail() {

        System.out.println("Ask dear Yakup hocam");
        Assert.fail();
    }
}
