package com.mgp.mdemo1.frontend.tests.pageobject;

import com.mgp.mdemo1.frontend.tests.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class PreRequestPage extends ElementHelper {
    @FindBy(xpath = "//android.view.View[@content-desc='Mortgage Prequalification Request']")
    private WebElement preRequestPageTittle;
    @FindBy(xpath = "//*[contains(@content-desc,'Select a user')]")
    private WebElement selectAUserButton;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User1')]")
    private WebElement selectTestUser1;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User2')]")
    private WebElement selectTestUser2;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User3')]")
    private WebElement selectTestUser3;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User4')]")
    private WebElement selectTestUser4;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User5')]")
    private WebElement selectTestUser5;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User6')]")
    private WebElement selectTestUser6;
    @FindBy(xpath = "//*[contains(@content-desc,'Test User7')]")
    private WebElement selectTestUser7;

    public PreRequestPage(AndroidDriver driver) {
        super(driver);
    }

    public PreRequestPage pressSelectAUserButton() {
        waitForPresence(driver,10, selectAUserButton);
        selectAUserButton.click();
        return this;
    }

    public void selectUserWithName(String name) {
        waitForPresence(driver,10, selectTestUser1);
        switch(name.trim().toLowerCase(Locale.ROOT)) {
            case "test user1":
                selectTestUser1.click();
                break;
            case "test user2":
                selectTestUser2.click();
                break;
            case "test user3":
                selectTestUser3.click();
                break;
            case "test user4":
                selectTestUser4.click();
                break;
            case "test user5":
                selectTestUser5.click();
                break;
            case "test user6":
                selectTestUser6.click();
                break;
            case "test user7":
                selectTestUser7.click();
                break;
            default:
                System.out.println("User name does not exist!");
        }
    }

    public void waitForPageLoad() {
        waitForPresence(driver,5, preRequestPageTittle);
    }
}
