package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrossIncomePageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement grossIncomeTxt;

    public GrossIncomePageIOS(IOSDriver driver) {
        super(driver);
    }

    public void inputInGrossIncomeTextBox(String money) {
        waitForPresence(driver,10, grossIncomeTxt);
        grossIncomeTxt.clear();
        grossIncomeTxt.sendKeys(money);
    }
}
