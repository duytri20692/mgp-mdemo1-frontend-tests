package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.SummaryReviewPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.SummaryReviewPageIOS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SummaryReviewSteps extends BasePage {
    SummaryReviewPage summaryReviewPageAndroid;
    SummaryReviewPageIOS summaryReviewPageIOS;

    @Then("User should see the Summary Review Page")
    public void userShouldSeeTheSummaryReviewPage() {
        if(device_running.equals("android")){
            summaryReviewPageAndroid = new SummaryReviewPage(androidDriver);
            summaryReviewPageAndroid.waitForPageLoad();
        }else if(device_running.equals("ios")){
            summaryReviewPageIOS = new SummaryReviewPageIOS(iosDriver);
            summaryReviewPageIOS.waitForPageLoad();
        }
    }

    @When("User click on the Submit button")
    public void userClickOnTheSubmitButton() {
        if(device_running.equals("android")){
            summaryReviewPageAndroid.clickOnTheSubmitButton();
        }else if(device_running.equals("ios")){
            summaryReviewPageIOS.clickOnTheSubmitButton();
        }
    }
}
