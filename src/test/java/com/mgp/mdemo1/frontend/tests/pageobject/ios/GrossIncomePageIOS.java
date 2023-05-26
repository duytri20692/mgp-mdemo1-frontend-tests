package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrossIncomePageIOS extends ElementHelper {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement grossIncomeTxt;

    public GrossIncomePageIOS(AppiumDriver driver) {
        super(driver);
    }

    public void inputInGrossIncomeTextBox(String money) {
        waitForPresence(driver,10, grossIncomeTxt);
        grossIncomeTxt.clear();
        grossIncomeTxt.sendKeys(money);
    }
}
