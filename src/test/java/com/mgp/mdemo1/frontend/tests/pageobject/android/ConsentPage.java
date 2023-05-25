package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsentPage extends ElementHelperAndroid {
    @FindBy(xpath = "//android.view.View[@content-desc='Yes']/android.widget.RadioButton")
    private WebElement yes_Cbx;
    @FindBy(xpath = "//android.view.View[@content-desc='No']/android.widget.RadioButton")
    private WebElement no_Cbx;
    @FindBy(xpath = "//android.view.View[@content-desc=\"We need your consent!\"]")
    private WebElement consentPageTitle;

    public ConsentPage(AndroidDriver driver) {
        super(driver);
    }

    public ConsentPage pressYesCheckbox() {
        waitForPresence(driver,10, yes_Cbx);
        yes_Cbx.click();
        return this;
    }

    public ConsentPage pressNoCheckbox() {
        waitForPresence(driver,10, no_Cbx);
        no_Cbx.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,10, consentPageTitle);
    }
}
