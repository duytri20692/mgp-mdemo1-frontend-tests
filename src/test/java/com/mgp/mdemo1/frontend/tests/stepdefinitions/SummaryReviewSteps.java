package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.SummaryReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SummaryReviewSteps extends BasePage {
    SummaryReviewPage summaryReviewPage = new SummaryReviewPage(driver);

    @Then("User should see the Summary Review Page")
    public void userShouldSeeTheSummaryReviewPage() {
        summaryReviewPage.waitForPageLoad();
    }

    @When("User click on the Submit button")
    public void userClickOnTheSubmitButton() {
        summaryReviewPage.clickOnTheSubmitButton();
    }
}
