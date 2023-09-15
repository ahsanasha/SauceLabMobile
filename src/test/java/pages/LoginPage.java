package pages;

import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utilities.PropertiesReader;

public class LoginPage extends PageObject {

    @AndroidFindBy(accessibility = "test-Password")
    private WebElement password;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private WebElement loginBtn;

    @AndroidFindBy(accessibility = "test-Username")
    private WebElement userName;

    public void enterValidUser() {
        typeInto(userName, PropertiesReader.getValidUser());
    }

    public void enterValidPass() {
        typeInto(password, PropertiesReader.getValidPassword());
    }

    public void clickLogin() {
        clickOn(loginBtn);
    }


    public void alreadyOnLoginPage() {
        waitFor(userName);
    }

}
