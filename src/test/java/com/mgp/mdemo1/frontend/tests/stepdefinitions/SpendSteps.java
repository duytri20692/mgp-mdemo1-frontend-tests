package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.MonthlyExpensesPage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.SpendPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.MonthlyExpensesPageIOS;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.SpendPageIOS;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class SpendSteps extends BasePage {
    SpendPage spendPageAndroid;
    SpendPageIOS spendPageIOS;

    @And("User input on Spend money text box with value is {string}")
    public void userInputOnSpendMoneyTextBoxWithValueIs(String spendMoney) {
        if(device_running.equals("android")){
            spendPageAndroid = new SpendPage(driver);
            spendPageAndroid.inputOnSpendMoneyTextBox(spendMoney.trim());
        }else if(device_running.equals("ios")){
            spendPageIOS = new SpendPageIOS(driver);
            spendPageIOS.inputOnSpendMoneyTextBox(spendMoney.trim());
//            iosDriver.hideKeyboard();
        }
    }

    @And("User should see an error message as {string}")
    public void userShouldSeeAnErrorMessageAs(String SpendPageErrorMessage) {
        if(device_running.equals("android")){
            spendPageAndroid = new SpendPage(driver);
            Assert.assertEquals(spendPageAndroid.getErrorMsgText().trim(), SpendPageErrorMessage.trim());
        }else if(device_running.equals("ios")){
            spendPageIOS = new SpendPageIOS(driver);
            Assert.assertEquals(spendPageIOS.getErrorMsgText().trim(), SpendPageErrorMessage.trim());
        }
    }
}
