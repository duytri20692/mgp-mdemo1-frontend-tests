package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.WeAreSorryPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.WeAreSorryPageIOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WeAreSorrySteps extends BasePage {
    WeAreSorryPage weAreSorryPageAndroid;
    WeAreSorryPageIOS weAreSorryPageIOS;

    @Then("User should see we are sorry page")
    public void userShouldSeeWeAreSorryPage() {
        if(device_running.equals("android")){
            weAreSorryPageAndroid = new WeAreSorryPage(androidDriver);
            weAreSorryPageAndroid.waitForPageLoad();
        }
        else if(device_running.equals("ios")){
            weAreSorryPageIOS = new WeAreSorryPageIOS(iosDriver);
            weAreSorryPageIOS.waitForPageLoad();
        }
    }

    @And("User should see the message {string}")
    public void userShouldSeeTheMessage(String msg) {
        if(device_running.equals("android")){
            Assert.assertEquals(weAreSorryPageAndroid.getWeAreSorryTextText(), msg);
        }
        else if(device_running.equals("ios")){
            Assert.assertEquals(weAreSorryPageIOS.getWeAreSorryTextText(), msg);
        }
    }
}
