package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownPaymentPageIOS extends ElementHelper {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement downPaymentTxt;

    public DownPaymentPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public void inputInDownPaymentTextBox(String money) {
        waitForPresence(driver,10, downPaymentTxt);
        downPaymentTxt.clear();
        downPaymentTxt.sendKeys(money);
    }
}
