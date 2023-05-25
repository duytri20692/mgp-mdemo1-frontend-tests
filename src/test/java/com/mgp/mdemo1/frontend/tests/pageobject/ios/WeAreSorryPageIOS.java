package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperAndroid;
import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeAreSorryPageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Start again']")
    private WebElement startAgainBtn;
    @FindBy(xpath = "(//XCUIElementTypeStaticText)[last()]")
    private WebElement weAreSorryText;

    public WeAreSorryPageIOS(IOSDriver driver) {
        super(driver);
    }

    public String getWeAreSorryTextText(){
        waitForPresence(driver,10, weAreSorryText);
        return weAreSorryText.getAttribute("label");
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, weAreSorryText);
    }
}
