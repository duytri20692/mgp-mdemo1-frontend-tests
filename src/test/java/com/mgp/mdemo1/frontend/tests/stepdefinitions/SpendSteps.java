package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.MonthlyExpensesPage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.SpendPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.MonthlyExpensesPageIOS;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.SpendPageIOS;
import io.cucumber.java.en.And;

public class SpendSteps extends BasePage {
    SpendPage spendPageAndroid;
    SpendPageIOS spendPageIOS;

    @And("User input on Spend money text box with value is {string}")
    public void userInputOnSpendMoneyTextBoxWithValueIs(String spendMoney) {
        if(device_running.equals("android")){
            spendPageAndroid = new SpendPage(androidDriver);
            spendPageAndroid.inputOnSpendMoneyTextBox(spendMoney);
        }else if(device_running.equals("ios")){
            spendPageIOS = new SpendPageIOS(iosDriver);
            spendPageIOS.inputOnSpendMoneyTextBox(spendMoney);
            iosDriver.hideKeyboard();
        }
    }
}
