package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TellUsPage extends ElementHelper {
    @FindBy(xpath = "//*[@content-desc=\"House or Condo\"]/android.widget.RadioButton")
    private WebElement q1_HouseOrCondoCbx;
    @FindBy(xpath = "//*[@content-desc=\"Other\"]/android.widget.RadioButton")
    private WebElement q1_OtherCbx;
    @FindBy(xpath = "(//*[@content-desc=\"Yes\"])[1]/android.widget.RadioButton")
    private WebElement q2_YesCbx;
    @FindBy(xpath = "(//*[@content-desc=\"No\"])[1]/android.widget.RadioButton")
    private WebElement q2_NoCbx;
    @FindBy(xpath = "(//*[@content-desc=\"Yes\"])[2]/android.widget.RadioButton")
    private WebElement q3_YesCbx;
    @FindBy(xpath = "(//*[@content-desc=\"No\"])[2]/android.widget.RadioButton")
    private WebElement q3_NoCbx;
    @FindBy(xpath = "(//*[@content-desc=\"Yes\"])[3]/android.widget.RadioButton")
    private WebElement q4_YesCbx;
    @FindBy(xpath = "(//*[@content-desc=\"No\"])[3]/android.widget.RadioButton")
    private WebElement q4_NoCbx;
    @FindBy(xpath = "//*[@content-desc=\"Next\"]")
    private WebElement nextBtn;

    public TellUsPage(AppiumDriver driver) {
        super(driver);
    }

    public TellUsPage pressQ1_HouseOrCondo_Checkbox() {
        waitForPresence(driver,10, q1_HouseOrCondoCbx);
        q1_HouseOrCondoCbx.click();
        return this;
    }

    public TellUsPage pressQ1_Other_Checkbox() {
        waitForPresence(driver,10, q1_OtherCbx);
        q1_OtherCbx.click();
        return this;
    }

    public TellUsPage pressQ2_Yes_Checkbox() {
        waitForPresence(driver,10, q2_YesCbx);
        q2_YesCbx.click();
        return this;
    }

    public TellUsPage pressQ2_No_Checkbox() {
        waitForPresence(driver,10, q2_NoCbx);
        q2_NoCbx.click();
        return this;
    }

    public TellUsPage pressQ3_Yes_Checkbox() {
        waitForPresence(driver,10, q3_YesCbx);
        q3_YesCbx.click();
        return this;
    }

    public TellUsPage pressQ3_No_Checkbox() {
        waitForPresence(driver,10, q3_NoCbx);
        q3_NoCbx.click();
        return this;
    }

    public TellUsPage pressQ4_Yes_Checkbox() {
        waitForPresence(driver,10, q4_YesCbx);
        q4_YesCbx.click();
        return this;
    }

    public TellUsPage pressQ4_No_Checkbox() {
        waitForPresence(driver,10, q4_NoCbx);
        q4_NoCbx.click();
        return this;
    }

    public TellUsPage pressNextButton() {
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
