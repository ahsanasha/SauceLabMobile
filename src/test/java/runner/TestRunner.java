package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import stepDefinitions.Hooks;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "stepDefinitions"

)
public class TestRunner extends Hooks {

    @Managed(driver="appium")
    public WebDriver driver;
}
