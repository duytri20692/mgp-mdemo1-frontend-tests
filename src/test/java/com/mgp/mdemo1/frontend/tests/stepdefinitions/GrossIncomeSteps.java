package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.GrossIncomePage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.GrossIncomePageIOS;
import io.cucumber.java.en.And;

public class GrossIncomeSteps extends BasePage {
    GrossIncomePage grossIncomePageAndroid;
    GrossIncomePageIOS grossIncomePageIOS;

    @And("User input on Gross income text box with value is {string}")
    public void userInputOnGrossIncomeTextBoxWithValueIs(String grossIncome) {
        if(device_running.equals("android")){
            grossIncomePageAndroid = new GrossIncomePage(driver);
            grossIncomePageAndroid.inputInGrossIncomeTextBox(grossIncome);
        }else if(device_running.equals("ios")){
            grossIncomePageIOS = new GrossIncomePageIOS(driver);
            grossIncomePageIOS.inputInGrossIncomeTextBox(grossIncome);
//            iosDriver.hideKeyboard();
        }
    }
}
