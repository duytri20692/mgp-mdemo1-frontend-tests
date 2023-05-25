package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpendPageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement spendMoneyTxt;

    public SpendPageIOS(IOSDriver driver) {
        super(driver);
    }

    public void inputOnSpendMoneyTextBox(String money) {
        waitForPresence(driver,10, spendMoneyTxt);
        spendMoneyTxt.clear();
        spendMoneyTxt.sendKeys(money);

    }
}
