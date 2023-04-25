package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.DownPaymentPage;
import io.cucumber.java.en.And;

public class DownPaymentSteps extends BasePage {
    DownPaymentPage downPaymentPage = new DownPaymentPage(driver);

    @And("User input on Down payment money text box with value is {string}")
    public void userInputOnDownPaymentMoneyTextBoxWithValueIs(String downPaymentMoney) {
        downPaymentPage.inputInDownPaymentTextBox(downPaymentMoney);
    }
}
