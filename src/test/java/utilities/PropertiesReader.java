package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final String PATH_FILE_APPLICATION_PROPERTIES = "src/test/resources/application.properties";
    private final Properties properties;
    private static String VALID_USER;
    private static String VALID_PASSWORD;
    private static String INVALID_USER;
    private static String INVALID_PASSWORD;
    private static String APPIUM_DRIVER_PATH;
    private static String APPIUM_JS_PATH;


    public PropertiesReader() throws IOException {
        File file = new File(PATH_FILE_APPLICATION_PROPERTIES);
        String absolutePath = file.getAbsolutePath();
        this.properties = new Properties();
        this.properties.load(new FileInputStream(absolutePath));
    }

    public String getProperty(String propertyName) {
        return this.properties.getProperty(propertyName);
    }


    public void initializeProperties() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        VALID_USER = propertiesReader.getProperty("sauce.valid.user");
        VALID_PASSWORD = propertiesReader.getProperty("sauce.valid.password");
        INVALID_USER = propertiesReader.getProperty("sauce.invalid.user");
        INVALID_PASSWORD = propertiesReader.getProperty("sauce.invalid.password");
        APPIUM_DRIVER_PATH = propertiesReader.getProperty("appium.driver.path");
        APPIUM_JS_PATH = propertiesReader.getProperty("appium.js.path");

    }

    public static String getValidUser() {
        return VALID_USER;
    }

    public static String getValidPassword() {
        return VALID_PASSWORD;
    }

    public static String getInvalidUser() {
        return INVALID_USER;
    }

    public static String getInvalidPassword() {
        return INVALID_PASSWORD;
    }

    public static String getAppiumDriverPath() {
        return APPIUM_DRIVER_PATH;
    }

    public static String getAppiumJsPath() {
        return APPIUM_JS_PATH;
    }

}
