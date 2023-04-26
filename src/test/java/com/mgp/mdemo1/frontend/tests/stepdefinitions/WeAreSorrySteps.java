package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.WeAreSorryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WeAreSorrySteps extends BasePage {
    WeAreSorryPage weAreSorryPage = new WeAreSorryPage(driver);

    @Then("User should see we are sorry page")
    public void userShouldSeeWeAreSorryPage() {
        weAreSorryPage.waitForPageLoad();
    }

    @And("User should see the message {string}")
    public void userShouldSeeTheMessage(String msg) {
        Assert.assertEquals(weAreSorryPage.getWeAreSorryTextText(), msg);
    }
}
