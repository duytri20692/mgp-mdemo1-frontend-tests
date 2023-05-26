package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.PreRequestPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.PreRequestPageIOS;
import io.cucumber.java.en.Given;

public class PreRequestSteps extends BasePage {
    PreRequestPage preRequestPageAndroid;
    PreRequestPageIOS preRequestPageIOS;

    @Given("User go to the Prequalification page and select user as {string}")
    public void userGoToThePrequalificationPageAndSelectUserAs(String user) throws InterruptedException {
        if(device_running.equals("android")){
            preRequestPageAndroid = new PreRequestPage(driver);
            preRequestPageAndroid.waitForPageLoad();
            preRequestPageAndroid.pressSelectAUserButton();
            preRequestPageAndroid.selectUserWithName(user);
        }else if(device_running.equals("ios")){
            preRequestPageIOS = new PreRequestPageIOS(driver);
            preRequestPageIOS.waitForPageLoad();
            preRequestPageIOS.pressSelectAUserButton();
            preRequestPageIOS.selectUserWithName(user);
        }
    }
}
