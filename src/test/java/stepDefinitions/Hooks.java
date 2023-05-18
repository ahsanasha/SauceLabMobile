package stepDefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
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
