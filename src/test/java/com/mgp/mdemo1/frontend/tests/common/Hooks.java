package com.mgp.mdemo1.frontend.tests.common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.*;

import io.github.cdimascio.dotenv.Dotenv;

public class Hooks extends BasePage {
    Dotenv dotenv = Dotenv.load();

    // Running on local Android
//    @Before
//    public static void setupDriver() throws MalformedURLException {
//        File appDir = new File(System.getProperty("user.dir") + "/apps");
//        File app = new File(appDir, "app-debug-dev.apk");
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
//        caps.setCapability("app", app.getAbsolutePath());
//        caps.setCapability("unicodeKeyboard", "true");
//        caps.setCapability("resetKeyboard", "true");
//
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
//    }

    // Running on browserstack Android + iOS
    @Before
    public void setupDriver() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject config = null;
        if(dotenv.get("RUNNING_ANDROID").trim().toLowerCase(Locale.ROOT).equals("true")){
            device_running = "android";
            config = (JSONObject) parser.parse(new FileReader("src/test/resources/testData/android.conf.json"));
        }else if(dotenv.get("RUNNING_IOS").trim().toLowerCase(Locale.ROOT).equals("true")){
            device_running = "ios";
            config = (JSONObject) parser.parse(new FileReader("src/test/resources/testData/ios.conf.json"));
        }

        DesiredCapabilities caps = new DesiredCapabilities();
        Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
        Iterator it = commonCapabilities.entrySet().iterator();
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(caps.getCapability(pair.getKey().toString()) == null){
                caps.setCapability(pair.getKey().toString(), pair.getValue());
            }
        }
        LocalDateTime currentDateTime = LocalDateTime.now();

        if(device_running.equals("android")){
            caps.setCapability("build", "Android build_" + currentDateTime.toString());
            androidDriver = new AndroidDriver(new URL("http://"+dotenv.get("BROWSERSTACK_USER_NAME")+":"+dotenv.get("BROWSERSTACK_ACCESS_KEY")+"@"+dotenv.get("BROWSERSTACK_SERVER")+"/wd/hub"), caps);
        }else if(device_running.equals("ios")){
            caps.setCapability("build", "iOS build_" + currentDateTime.toString());
            iosDriver = new IOSDriver(new URL("http://"+dotenv.get("BROWSERSTACK_USER_NAME")+":"+dotenv.get("BROWSERSTACK_ACCESS_KEY")+"@"+dotenv.get("BROWSERSTACK_SERVER")+"/wd/hub"), caps);
        }
    }

    @After
    public static void quitDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
        }else if(iosDriver != null){
            iosDriver.quit();
        }
    }
}
