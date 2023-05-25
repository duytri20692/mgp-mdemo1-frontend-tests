package com.mgp.mdemo1.frontend.tests.pageobject.ios;

import com.mgp.mdemo1.frontend.tests.common.ElementHelperIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class PreRequestPageIOS extends ElementHelperIOS {
    @FindBy(xpath = "//*[@name='Mortgage Prequalification Request']")
    private WebElement preRequestPageTittle;
    @FindBy(xpath = "//*[@name='Select a user']")
    private WebElement selectAUserButton;
    @FindBy(xpath = "//*[contains(@name,'Test User1')]")
    private WebElement selectTestUser1;
    @FindBy(xpath = "//*[contains(@name,'Test User2')]")
    private WebElement selectTestUser2;
    @FindBy(xpath = "//*[contains(@name,'Test User3')]")
    private WebElement selectTestUser3;
    @FindBy(xpath = "//*[contains(@name,'Test User4')]")
    private WebElement selectTestUser4;
    @FindBy(xpath = "//*[contains(@name,'Test User5')]")
    private WebElement selectTestUser5;
    @FindBy(xpath = "//*[contains(@name,'Test User6')]")
    private WebElement selectTestUser6;
    @FindBy(xpath = "//*[contains(@name,'Test User7')]")
    private WebElement selectTestUser7;

    public PreRequestPageIOS(IOSDriver driver) {
        super(driver);
    }

    public PreRequestPageIOS pressSelectAUserButton() {
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
