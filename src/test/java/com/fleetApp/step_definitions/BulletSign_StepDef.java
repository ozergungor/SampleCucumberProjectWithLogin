package com.fleetApp.step_definitions;

import com.fleetApp.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BulletSign_StepDef {

    LoginPage loginPage=new LoginPage();
    @When("Users enter their {string}")
    public void usersEnterTheir(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    @Then("User should see their password in bullet sign")
    public void userShouldSeeTheirPasswordInBulletSign() {
        Assert.assertEquals("password",loginPage.passwordField.getAttribute("type"));

    }
}
