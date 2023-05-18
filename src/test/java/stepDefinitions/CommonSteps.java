package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;

public class CommonSteps {
    @Steps
    LoginPage login;

    @Given("User is already on the home page")
    public void user_is_already_on_the_home_page() {
        login.alreadyOnLoginPage();
        login.enterValidUser();
        login.enterValidPass();
        login.clickLogin();
    }


}
