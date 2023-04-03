package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.pageobject.PaymentPage;
import com.mgp.mdemo1.frontend.tests.common.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class PaymentSteps extends BasePage {
    PaymentPage paymentPage = new PaymentPage(driver);

    @And("User input information as the below")
    public void userInputInformationAsTheBelow(DataTable dataTable) {
        paymentPage.inputPhone(dataTable.cell(0,1));
        paymentPage.inputName(dataTable.cell(1,1));
        paymentPage.seekBarAmount(Integer.parseInt(dataTable.cell(2,1)));
        paymentPage.inputCountry(dataTable.cell(3,1));
    }

    @And("User click on the Send Payment button")
    public void userClickOnTheSendPaymentButton() {
        paymentPage.pressSendPaymentButton();
    }

    @And("User click on confirm Yes to send the payment popup")
    public void userClickOnConfirmYesToSendThePaymentPopup() {
        paymentPage.pressYesButtonOnConfirmSendPaymentPopup();
    }
}
