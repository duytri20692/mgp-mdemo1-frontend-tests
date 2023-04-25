package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.PreRequestPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PreRequestSteps extends BasePage {
    PreRequestPage preRequestPage = new PreRequestPage(driver);

    @Given("User open the Mozaic application and go to the Mortgage Prequalification Request page")
    public void userOpenTheMozaicApplicationAndGoToTheMortgagePrequalificationRequestPage() {
        preRequestPage.waitForPageLoad();
        preRequestPage.pressSelectMenuButton();
        preRequestPage.pressMenuMortgagePrequalification();
    }
}
