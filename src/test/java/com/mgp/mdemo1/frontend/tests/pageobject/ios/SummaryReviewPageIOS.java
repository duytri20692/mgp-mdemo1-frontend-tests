package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryReviewPageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//*[@name='Submit']")
    private WebElement submitButton;

    public SummaryReviewPageIOS(IOSDriver driver) {
        super(driver);
    }

    public SummaryReviewPageIOS clickOnTheSubmitButton() {
        waitForPresence(driver,10, submitButton);
        submitButton.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, submitButton);
    }
}
