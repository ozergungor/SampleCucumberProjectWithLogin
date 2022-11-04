package com.fleetApp.step_definitions;

import com.fleetApp.pages.HomePage;
import com.fleetApp.pages.LoginPage;
import com.fleetApp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RememberMe_StepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @When("User clicks Remember Me box")
    public void user_clicks_remember_me_box() {

        loginPage.rememberMeBox.click();
    }
    @And("User enters credentials and clicks login btn")
    public void userEntersCredentialsAndClicksLoginBtn() {

        loginPage.loginAsDriver();
    }
    @When("User lands on DashBoard Page")
    public void user_lands_on_dash_board_page() {

        Assert.assertEquals("Dashboard", Driver.get().getTitle());

    }
    @When("User logs out")
    public void user_logs_out() {

        homePage.johnDoeClick.click();
        homePage.logoutBtn.click();
    }
    @Then("User should see the credentials already entered in the login page in the next attempt")
    public void user_should_see_the_credentials_already_entered_in_the_login_page_in_the_next_attempt() {

        String username = "user1";
        loginPage.inputVerify(username);
    }
}
