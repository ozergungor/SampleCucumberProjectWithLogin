package com.fleetApp.step_definitions;

import com.fleetApp.pages.HomePage;
import com.fleetApp.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnterKeyFunction_StepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @When("User enters username credential")
    public void user_enters_username_credential() {

        loginPage.enterUsername();

    }

    @When("User enters password credential")
    public void user_enters_password_credential() {

        loginPage.enterPassword();

    }

    @Then("User should land on the Home Page")
    public void user_should_land_on_the_home_page() {

        homePage.verifyTitleHomePage();

    }


}
