package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeAreSorryPage extends ElementHelper {
    @FindBy(xpath = "//*[@content-desc=\"Start again\"]")
    private WebElement startAgainBtn;
    @FindBy(xpath = "//*[@content-desc=\"Werex sorry you declined our process!\"]")
    private WebElement weAreSorryText;

    public WeAreSorryPage(AppiumDriver driver) {
        super(driver);
    }

    public String getWeAreSorryTextText(){
        waitForPresence(driver,10, weAreSorryText);
        return weAreSorryText.getAttribute("content-desc");
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, weAreSorryText);
    }
}
