package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownPaymentPage extends ElementHelperAndroid {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement downPaymentTxt;

    public DownPaymentPage(AndroidDriver driver) {
        super(driver);
    }

    public void inputInDownPaymentTextBox(String money) {
        waitForPresence(driver,10, downPaymentTxt);
        downPaymentTxt.clear();
        downPaymentTxt.sendKeys(money);
    }
}
