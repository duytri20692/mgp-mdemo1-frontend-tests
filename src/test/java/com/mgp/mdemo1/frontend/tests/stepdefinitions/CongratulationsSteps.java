package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.CongratulationsPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.CongratulationsPageIOS;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class CongratulationsSteps extends BasePage {
    CongratulationsPage congratulationsPageAndroid;
    CongratulationsPageIOS congratulationsPageIOS;

    @And("User should see the Congratulations page")
    public void userShouldSeeTheCongratulationsPage()
    {
        if(device_running.equals("android")){
            congratulationsPageAndroid = new CongratulationsPage(driver);
            congratulationsPageAndroid.waitForPageLoad();
        }else if(device_running.equals("ios")){
            congratulationsPageIOS = new CongratulationsPageIOS(driver);
            congratulationsPageIOS.waitForPageLoad();
        }
    }

    @And("User should see the Congratulations message as {string}")
    public void userShouldSeeTheCongratulationsMessageAs(String congraMsg) {
        if(device_running.equals("android")){
            Assert.assertEquals(congratulationsPageAndroid.getCongratulationsText().trim(), congraMsg.trim());
        }else if(device_running.equals("ios")){
            Assert.assertEquals(congratulationsPageIOS.getCongratulationsText().trim(), congraMsg.trim());
        }
    }
}
