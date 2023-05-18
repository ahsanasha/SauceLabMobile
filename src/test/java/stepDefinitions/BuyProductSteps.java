package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.HomePage;

public class BuyProductSteps {

    @Steps
    HomePage homePage;

    @When("User click add to cart")
    public void userClickAddToCart() {
        homePage.addToCart();
    }

    @Then("Product will be added to the cart")
    public void productWillBeAddedToTheCart() {
        Assert.assertEquals("2", homePage.getCountCart());
    }
}
