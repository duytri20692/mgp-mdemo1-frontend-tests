package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.GrossIncomePage;
import io.cucumber.java.en.And;

public class GrossIncomeSteps extends BasePage {
    GrossIncomePage grossIncomePage = new GrossIncomePage(driver);

    @And("User input on Gross income text box with value is {string}")
    public void userInputOnGrossIncomeTextBoxWithValueIs(String grossIncome) {
        grossIncomePage.inputInGrossIncomeTextBox(grossIncome);
    }
}
