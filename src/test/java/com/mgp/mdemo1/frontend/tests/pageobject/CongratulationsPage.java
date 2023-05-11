package com.mgp.mdemo1.frontend.tests.pageobject;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CongratulationsPage extends ElementHelper {
    @FindBy(xpath = "//android.view.View[@content-desc=\"Congratulations!\"]")
    private WebElement CongratulationsTitle;
    @FindBy(xpath = "//android.view.View[@content-desc=\"You have qualified for our Mortgage Prequalification Program.\"]")
    private WebElement CongratulationsText;

    public CongratulationsPage(AndroidDriver driver) {
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
