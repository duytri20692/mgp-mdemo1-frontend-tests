package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.PreRequestPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PreRequestSteps extends BasePage {
    PreRequestPage preRequestPage = new PreRequestPage(driver);

    @Given("User go to the Prequalification page and select user as {string}")
    public void userGoToThePrequalificationPageAndSelectUserAs(String user) throws InterruptedException {
        preRequestPage.waitForPageLoad();
        preRequestPage.pressSelectAUserButton();
        preRequestPage.selectUserWithName(user);
    }
}
