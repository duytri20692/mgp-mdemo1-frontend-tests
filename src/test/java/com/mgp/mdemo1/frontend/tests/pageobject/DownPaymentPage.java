package com.mgp.mdemo1.frontend.tests.pageobject;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownPaymentPage extends ElementHelper {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement downPaymentTxt;

    public DownPaymentPage(AndroidDriver driver) {
        super(driver);
    }

    public DownPaymentPage inputInDownPaymentTextBox(String money) {
        waitForPresence(driver,10, downPaymentTxt);
        downPaymentTxt.sendKeys(money);
        return this;
    }
}
