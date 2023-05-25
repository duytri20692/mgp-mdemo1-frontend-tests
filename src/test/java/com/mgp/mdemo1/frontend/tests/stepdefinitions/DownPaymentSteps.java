package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.DownPaymentPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.DownPaymentPageIOS;
import io.cucumber.java.en.And;

public class DownPaymentSteps extends BasePage {
    DownPaymentPage downPaymentPageAndroid;
    DownPaymentPageIOS downPaymentPageIOS;

    @And("User input on Down payment money text box with value is {string}")
    public void userInputOnDownPaymentMoneyTextBoxWithValueIs(String downPaymentMoney) {
        if(device_running.equals("android")){
            downPaymentPageAndroid = new DownPaymentPage(androidDriver);
            downPaymentPageAndroid.inputInDownPaymentTextBox(downPaymentMoney);
        }else if(device_running.equals("ios")){
            downPaymentPageIOS = new DownPaymentPageIOS(iosDriver);
            downPaymentPageIOS.inputInDownPaymentTextBox(downPaymentMoney);
            iosDriver.hideKeyboard();
        }
    }
}
