package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsentPageIOS extends ElementHelper {
    @FindBy(xpath = "//*[@name='Yes']/following-sibling::XCUIElementTypeSwitch")
    private WebElement yes_Cbx;
    @FindBy(xpath = "//*[@name='No']/following-sibling::XCUIElementTypeSwitch")
    private WebElement no_Cbx;
    @FindBy(xpath = "//*[@name='We need your consent!']")
    private WebElement consentPageTitle;

    public ConsentPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public ConsentPageIOS pressYesCheckbox() {
        waitForPresence(driver,10, yes_Cbx);
        yes_Cbx.click();
        return this;
    }

    public ConsentPageIOS pressNoCheckbox() {
        waitForPresence(driver,10, no_Cbx);
        no_Cbx.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,10, consentPageTitle);
    }
}
