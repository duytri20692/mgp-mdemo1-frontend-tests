package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryReviewPage extends ElementHelperAndroid {
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    private WebElement submitButton;

    public SummaryReviewPage(AndroidDriver driver) {
        super(driver);
    }

    public SummaryReviewPage clickOnTheSubmitButton() {
        waitForPresence(driver,10, submitButton);
        submitButton.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, submitButton);
    }
}
