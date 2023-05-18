package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;

public class AppiumServer {


    public static AppiumDriverLocalService service;

    public static void start() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.initializeProperties();

        // starting the Appium server code

        service = AppiumDriverLocalService.buildService(
                new AppiumServiceBuilder().usingDriverExecutable(new File(propertiesReader.getAppiumDriverPath()))
                        .withAppiumJS(new File(PropertiesReader.getAppiumJsPath()))
                        .withLogFile(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\logs\\log.txt"))
                        .withArgument(GeneralServerFlag.BASEPATH,"/wd/hub")
                        .withArgument(GeneralServerFlag.LOCAL_TIMEZONE));

        service.start();

    }


    public static void stop() {

        service.stop();

    }



}
