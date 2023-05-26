package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CongratulationsPageIOS extends ElementHelper {
    @FindBy(xpath = "//*[@name='Congratulations!']")
    private WebElement CongratulationsTitle;
    @FindBy(xpath = "//*[@name='You have qualified for our Mortgage Prequalification Program.']")
    private WebElement CongratulationsText;

    public CongratulationsPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public String getCongratulationsText(){
        waitForPresence(driver,10, CongratulationsText);
        return CongratulationsText.getAttribute("label");
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, CongratulationsTitle);
    }
}
