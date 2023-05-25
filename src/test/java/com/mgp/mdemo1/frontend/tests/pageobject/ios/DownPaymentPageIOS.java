package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownPaymentPageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement downPaymentTxt;

    public DownPaymentPageIOS(IOSDriver driver) {
        super(driver);
    }

    public void inputInDownPaymentTextBox(String money) {
        waitForPresence(driver,10, downPaymentTxt);
        downPaymentTxt.clear();
        downPaymentTxt.sendKeys(money);
    }
}
