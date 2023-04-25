package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.MonthlyExpensesPage;
import io.cucumber.java.en.And;

public class MonthlyExpensesSteps extends BasePage {
    MonthlyExpensesPage monthlyExpensesPage = new MonthlyExpensesPage(driver);

    @And("User input on Monthly Expenses text box with value is {string}")
    public void userInputOnMonthlyExpensesTextBoxWithValueIs(String monthlyExpenses) {
        monthlyExpensesPage.inputInMonthlyExpenseTextBox(monthlyExpenses);
    }
}
