package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpendPageIOS extends ElementHelper {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement spendMoneyTxt;
    @FindBy(xpath = "//XCUIElementTypeTextField/following-sibling::XCUIElementTypeOther")
    private WebElement errorMsg;

    public SpendPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public void inputOnSpendMoneyTextBox(String money) {
        waitForPresence(driver,10, spendMoneyTxt);
        spendMoneyTxt.clear();
        spendMoneyTxt.sendKeys(money);
    }

    public String getErrorMsgText(){
        waitForPresence(driver,10, errorMsg);
        return errorMsg.getAttribute("label");
    }
}
