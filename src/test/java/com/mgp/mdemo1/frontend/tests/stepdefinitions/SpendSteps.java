package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.SpendPage;
import io.cucumber.java.en.And;

public class SpendSteps extends BasePage {
    SpendPage spendPage = new SpendPage(driver);

    @And("User input on Spend money text box with value is {string}")
    public void userInputOnSpendMoneyTextBoxWithValueIs(String spendMoney) {
        spendPage.inputOnSpendMoneyTextBox(spendMoney);
    }
}
