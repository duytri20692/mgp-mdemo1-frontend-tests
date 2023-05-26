package com.mgp.mdemo1.frontend.tests.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    protected AppiumDriver driver;

    public ElementHelper(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean waitForPresence(AppiumDriver driver, int timeLimitInSeconds, WebElement webElement) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeLimitInSeconds));
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return webElement.isDisplayed();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void swiptToBottom()
    {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width/2;
        int top_y = (int)(height*0.80);
        int bottom_y = (int)(height*0.20);
        TouchAction ts = new TouchAction((PerformsTouchActions) driver);
        PointOption pointOption = new PointOption();
        ts.press(pointOption.withCoordinates(x, top_y)).moveTo(pointOption.withCoordinates(x, bottom_y)).release().perform();
    }
}
