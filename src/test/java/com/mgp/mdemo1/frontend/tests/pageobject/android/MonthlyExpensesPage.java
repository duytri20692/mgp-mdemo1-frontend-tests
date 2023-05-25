package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MonthlyExpensesPage extends ElementHelperAndroid {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement monthlyExpenseTxt;

    public MonthlyExpensesPage(AndroidDriver driver) {
        super(driver);
    }

    public void inputInMonthlyExpenseTextBox(String money) {
        waitForPresence(driver,10, monthlyExpenseTxt);
        monthlyExpenseTxt.clear();
        monthlyExpenseTxt.sendKeys(money);
    }
}
