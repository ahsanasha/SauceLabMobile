package pages;

import io.cucumber.java.en.And;
import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
    private WebElement labsBackpack;

    @AndroidFindBy(id = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]/android.widget.TextView")
    private WebElement labsBikeLight;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement cart;
    public void addToCart() {
        clickOn(labsBackpack);
        clickOn(labsBackpack);
    }

    public String getCountCart(){
        return cart.getText();
    }
}
