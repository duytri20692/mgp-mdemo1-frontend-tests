package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MonthlyExpensesPageIOS extends ElementHelper {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement monthlyExpenseTxt;

    public MonthlyExpensesPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public void inputInMonthlyExpenseTextBox(String money) {
        waitForPresence(driver,10, monthlyExpenseTxt);
        monthlyExpenseTxt.clear();
        monthlyExpenseTxt.sendKeys(money);
    }
}
