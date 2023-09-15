This project shows Appium and Serenity framework integration to run sample test case on native Android app.
## Required

1. Download [Java OpenJDK 11](https://jdk.java.net/java-se-ri/11)
   [Tutorial Installation Java in Windows](https://www.petanikode.com/java-windows/)
2. Download [Maven](https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/)
3. Install [Appium](https://appium.io/docs/en/2.0/quickstart/install/)
4. Install [uiautomator2 driver](https://appium.io/docs/en/2.0/quickstart/uiauto2-driver/)
5. Set env variable JAVA PATH
6. Set env variable MAVEN PATH
7. Set env variable APPIUM PATH
8. Have a android device or emulator

`*If your computer already installed Java, Maven and Appium, you can skip all step.`
## This project run on
1. serenity 4 version
2. appium 2 version


## Setting Appium capabilities in serenity.properties
1. appium.hub = Appium server URL
2. appium.platformName = Fill with your android platform name
3. appium.platformVersion  =  Fill with your android platform version
4. appium.deviceName  =  Fill with name of your device
5. appium.app  =  App file path
   drop your apk file in directory path that has been provided `src/test/resources/apkFile`

## Setting Appium path location in application.properties
1. appium.driver.path = path of appium driver
2. appium.js.path = path of js file

## Download Code Editor IntelliJ IDEA Community Edition (Optional)
Download [IntelliJ IDEA](https://www.jetbrains.com/idea/download)

`*IntelliJ IDEA for your code editor is optional, you can still used another code editor like Eclipse or Visual Studio Code.`

## Added New Scenario BDD

In order to add some Scenario BDD, we can create new file feature in directory `src/test/resources/features`

## Writing the step definitions (Breaking Down Scenario BDD Into Steps)

In order to translate the steps from Scenario BDD into executable actions, we write Java classes called Step Definitions in directory `src/test/java/steps`

## Writing the Page Object Class

Page Objects are a way of isolating the implementation details of a web page inside a class, exposing only business-focused methods related to that page.
We can create new Page Object file in directory `src/test/java/pages`


## Running Test Case

```
mvn clean verify
```
