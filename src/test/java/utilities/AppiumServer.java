package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;


public class AppiumServer {

    //    public static AppiumDriverLocalService service;
    public static AppiumDriverLocalService service;

    public static void start() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.initializeProperties();

        service = AppiumDriverLocalService.buildService(
                new AppiumServiceBuilder().usingDriverExecutable(new File(PropertiesReader.getAppiumDriverPath()))
                        .withAppiumJS(new File(PropertiesReader.getAppiumJsPath()))
//                        .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub")
                        .withLogFile(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\logs\\log.txt"))
                        .withArgument(GeneralServerFlag.LOCAL_TIMEZONE));

        if (service.isRunning()) {
            System.out.println("Appium sudah run");
        } else {
            service.start();
        }

    }

    public static void stop() {

        service.stop();

    }

}
