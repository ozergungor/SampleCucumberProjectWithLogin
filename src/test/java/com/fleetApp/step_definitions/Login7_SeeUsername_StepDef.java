package com.fleetApp.step_definitions;

import com.fleetApp.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login7_SeeUsername_StepDef {

    HomePage homePage = new HomePage();
    @Then("User can see his own {string} in the profile menu after login")
    public void user_can_see_his_own_in_the_profile_menu_after_login(String expectedUsername) {

        String actualUsername = homePage.johnDoeClick.getText();
        Assert.assertEquals(expectedUsername, actualUsername);
    }
}
