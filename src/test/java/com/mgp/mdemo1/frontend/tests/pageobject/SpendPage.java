package com.mgp.mdemo1.frontend.tests.pageobject;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpendPage extends ElementHelper {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement spendMoneyTxt;

    public SpendPage(AndroidDriver driver) {
        super(driver);
    }

    public SpendPage inputOnSpendMoneyTextBox(String money) {
        waitForPresence(driver,10, spendMoneyTxt);
        spendMoneyTxt.sendKeys(money);
        return this;
    }
}
