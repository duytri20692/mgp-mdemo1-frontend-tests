package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpendPage extends ElementHelper {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement spendMoneyTxt;

    public SpendPage(AppiumDriver driver) {
        super(driver);
    }

    public void inputOnSpendMoneyTextBox(String money) {
        waitForPresence(driver,10, spendMoneyTxt);
        spendMoneyTxt.clear();
        spendMoneyTxt.sendKeys(money);
    }
}
