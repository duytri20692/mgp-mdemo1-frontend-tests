package com.mgp.mdemo1.frontend.tests.pageobject.android;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrossIncomePage extends ElementHelper {
    @FindBy(xpath = "//android.widget.EditText")
    private WebElement grossIncomeTxt;

    public GrossIncomePage(AppiumDriver driver) {
        super(driver);
    }

    public void inputInGrossIncomeTextBox(String money) {
        waitForPresence(driver,10, grossIncomeTxt);
        grossIncomeTxt.clear();
        grossIncomeTxt.sendKeys(money);
    }
}
