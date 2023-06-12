package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CongratulationsPage extends ElementHelper {
    @FindBy(xpath = "//*[@content-desc=\"Congratulations!\"]")
    private WebElement CongratulationsTitle;
    @FindBy(xpath = "//*[@content-desc=\"You have qualified for our Mortgage Prequalification Program.\"]")
    private WebElement CongratulationsText;

    public CongratulationsPage(AppiumDriver driver) {
        super(driver);
    }

    public String getCongratulationsText(){
        waitForPresence(driver,10, CongratulationsText);
        return CongratulationsText.getAttribute("content-desc");
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, CongratulationsTitle);
    }
}
