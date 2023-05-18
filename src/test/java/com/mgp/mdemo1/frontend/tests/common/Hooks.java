package com.mgp.mdemo1.frontend.tests.common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import io.github.cdimascio.dotenv.Dotenv;

public class Hooks extends BasePage {
    Dotenv dotenv = Dotenv.load();
    // Running on local
//    @Before
//    public static void setupDriver() throws MalformedURLException {
//        File appDir = new File(System.getProperty("user.dir") + "/apps");
//        File app = new File(appDir, "app-debug-dev.apk");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "12.0");
//        capabilities.setCapability("deviceName", "emulator-5554");
//        capabilities.setCapability("automationName", "UIAutomator2");
//        capabilities.setCapability("app", app.getAbsolutePath());
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//    }

    // Running on browserstack
    @Before
    public void setupDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
//        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//        browserstackOptions.put("local", "true");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("unicodeKeyboard", "true");
        caps.setCapability("resetKeyboard", "true");
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "flutter"); // For testing Flutter apps
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S22");
//        caps.setCapability("app", dotenv.get("BROWSERSTACK_APP_ID"));
        caps.setCapability("app", "MozaicApp");

        URL url = new URL("http://" + dotenv.get("BROWSERSTACK_USER_NAME") + ":" + dotenv.get("BROWSERSTACK_ACCESS_KEY") + "@hub-cloud.browserstack.com/wd/hub");
        driver = new AndroidDriver(url, caps);
    }

    @After
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
