package com.mgp.mdemo1.frontend.tests.pageobject;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreRequestPage extends ElementHelper {
    @FindBy(xpath = "(//android.widget.Button)[1]")
    private WebElement menuButton;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Mortgage prequalification\"]")
    private WebElement menuMortgagePrequalification;
    @FindBy(xpath = "(//android.widget.Button)[2]")
    private WebElement selectAccountBtn;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Mortgage Prequalification Request\"]")
    private WebElement preRequestPageTittle;

    public PreRequestPage(AndroidDriver driver) {
        super(driver);
    }

    public PreRequestPage pressSelectMenuButton() {
        waitForPresence(driver,10, menuButton);
        menuButton.click();
        return this;
    }

    public PreRequestPage pressMenuMortgagePrequalification() {
        waitForPresence(driver,10, menuMortgagePrequalification);
        menuMortgagePrequalification.click();
        return this;
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, preRequestPageTittle);
    }
}
