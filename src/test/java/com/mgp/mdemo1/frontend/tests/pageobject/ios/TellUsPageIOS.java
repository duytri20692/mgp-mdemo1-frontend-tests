package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TellUsPageIOS extends ElementHelper {
    @FindBy(xpath = "//*[@name='House or Condo']/following-sibling::XCUIElementTypeSwitch")
    private WebElement q1_HouseOrCondoCbx;
    @FindBy(xpath = "//*[@name='Other']/following-sibling::XCUIElementTypeSwitch")
    private WebElement q1_OtherCbx;
    @FindBy(xpath = "(//*[@name='Yes'])[1]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q2_YesCbx;
    @FindBy(xpath = "(//*[@name='No'])[1]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q2_NoCbx;
    @FindBy(xpath = "(//*[@name='Yes'])[2]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q3_YesCbx;
    @FindBy(xpath = "(//*[@name='No'])[2]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q3_NoCbx;
    @FindBy(xpath = "(//*[@name='Yes'])[3]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q4_YesCbx;
    @FindBy(xpath = "(//*[@name='No'])[3]/following-sibling::XCUIElementTypeSwitch")
    private WebElement q4_NoCbx;
    @FindBy(xpath = "//*[@name='Next']")
    private WebElement nextBtn;

    public TellUsPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public TellUsPageIOS pressQ1_HouseOrCondo_Checkbox() {
        waitForPresence(driver,10, q1_HouseOrCondoCbx);
        q1_HouseOrCondoCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ1_Other_Checkbox() {
        waitForPresence(driver,10, q1_OtherCbx);
        q1_OtherCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ2_Yes_Checkbox() {
        waitForPresence(driver,10, q2_YesCbx);
        q2_YesCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ2_No_Checkbox() {
        waitForPresence(driver,10, q2_NoCbx);
        q2_NoCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ3_Yes_Checkbox() {
        waitForPresence(driver,10, q3_YesCbx);
        q3_YesCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ3_No_Checkbox() {
        waitForPresence(driver,10, q3_NoCbx);
        q3_NoCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ4_Yes_Checkbox() {
        waitForPresence(driver,10, q4_YesCbx);
        q4_YesCbx.click();
        return this;
    }

    public TellUsPageIOS pressQ4_No_Checkbox() {
        waitForPresence(driver,10, q4_NoCbx);
        q4_NoCbx.click();
        return this;
    }

    public TellUsPageIOS pressNextButton() {
        //scroll down to the element and click
//        swiptToBottom();
        waitForPresence(driver,10, nextBtn);
        nextBtn.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, q1_HouseOrCondoCbx);
    }
}
