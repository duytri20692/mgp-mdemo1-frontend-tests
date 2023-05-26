package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryReviewPageIOS extends ElementHelper {
    @FindBy(xpath = "//*[@name='Submit']")
    private WebElement submitButton;

    public SummaryReviewPageIOS(AppiumDriver driver) {
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
