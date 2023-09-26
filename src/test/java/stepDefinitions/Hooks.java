package stepDefinitions;

import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.AppiumServer;
import utilities.PropertiesReader;

import java.io.IOException;

public class Hooks {

    static PropertiesReader propertiesReader;

    static {
        try {
            propertiesReader = new PropertiesReader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeClass
    public static void setUp() throws IOException {

        AppiumServer.start();
        propertiesReader.initializeProperties();



    }

    @AfterClass
    public static void tearDown() {

        AppiumServer.stop();
    }
}
