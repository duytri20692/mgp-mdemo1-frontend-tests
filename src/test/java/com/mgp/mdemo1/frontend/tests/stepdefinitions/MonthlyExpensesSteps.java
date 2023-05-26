package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.MonthlyExpensesPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.MonthlyExpensesPageIOS;
import io.cucumber.java.en.And;

public class MonthlyExpensesSteps extends BasePage {
    MonthlyExpensesPage monthlyExpensesPageAndroid;
    MonthlyExpensesPageIOS monthlyExpensesPageIOS;

    @And("User input on Monthly Expenses text box with value is {string}")
    public void userInputOnMonthlyExpensesTextBoxWithValueIs(String monthlyExpenses) {
        if(device_running.equals("android")){
            monthlyExpensesPageAndroid = new MonthlyExpensesPage(driver);
            monthlyExpensesPageAndroid.inputInMonthlyExpenseTextBox(monthlyExpenses);
        }else if(device_running.equals("ios")){
            monthlyExpensesPageIOS = new MonthlyExpensesPageIOS(driver);
            monthlyExpensesPageIOS.inputInMonthlyExpenseTextBox(monthlyExpenses);
//            driver.hideKeyboard();
        }
    }
}
