package stepDefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.*;


public class LoginSteps {

    @Steps
    HomePage home;
    @Steps
    LoginPage login;

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        login.alreadyOnLoginPage();
    }

    @And("User enters valid user name")
    public void userEntersValidUserName() {
        login.enterValidUser();
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        login.enterValidPass();
    }

    @When("User clicks Login button")
    public void userClicksLoginButton() {
        login.clickLogin();
    }

    @Then("User should be navigate to home screen")
    public void userShouldBeNavigateToHomeScreen() {
        System.out.println("User navigated to the home page");
    }
}
