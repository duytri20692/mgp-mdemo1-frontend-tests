package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.TellUsPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.TellUsPageIOS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;

public class TellUsSteps extends BasePage {
    TellUsPage tellUsPageAndroid;
    TellUsPageIOS tellUsPageIOS;

    @Then("Click on the Next button")
    public void clickOnTheNextButton() {
        if(device_running.equals("android")){
            tellUsPageAndroid.pressNextButton();
        }
        else if(device_running.equals("ios")){
            tellUsPageIOS.pressNextButton();
        }
    }

    @When("User select answers as {string}, {string}, {string} and {string}")
    public void userSelectAnswersAsAnd(String q1, String q2, String q3, String q4) {
        if(device_running.equals("android")){
            tellUsPageAndroid = new TellUsPage(driver);
            // Select question 1
            if("n".equals(q1.trim().toLowerCase(Locale.ROOT))){
                tellUsPageAndroid.pressQ1_Other_Checkbox();
            }else{
                tellUsPageAndroid.pressQ1_HouseOrCondo_Checkbox();
            }
            // Select question 2
            if("n".equals(q2.trim().toLowerCase(Locale.ROOT))){
                tellUsPageAndroid.pressQ2_No_Checkbox();
            }else{
                tellUsPageAndroid.pressQ2_Yes_Checkbox();
            }
            // Select question 3
            if("n".equals(q3.trim().toLowerCase(Locale.ROOT))){
                tellUsPageAndroid.pressQ3_No_Checkbox();
            }else{
                tellUsPageAndroid.pressQ3_Yes_Checkbox();
            }
            // Select question 4
            if("n".equals(q4.trim().toLowerCase(Locale.ROOT))){
                tellUsPageAndroid.pressQ4_No_Checkbox();
            }else{
                tellUsPageAndroid.pressQ4_Yes_Checkbox();
            }
        }else if(device_running.equals("ios")){
            tellUsPageIOS = new TellUsPageIOS(driver);
            // Select question 1
            if(q1.trim().toLowerCase(Locale.ROOT).equals("n")){
                tellUsPageIOS.pressQ1_Other_Checkbox();
            }else{
                tellUsPageIOS.pressQ1_HouseOrCondo_Checkbox();
            }
            // Select question 2
            if(q2.trim().toLowerCase(Locale.ROOT).equals("n")){
                tellUsPageIOS.pressQ2_No_Checkbox();
            }else{
                tellUsPageIOS.pressQ2_Yes_Checkbox();
            }
            // Select question 3
            if(q3.trim().toLowerCase(Locale.ROOT).equals("n")){
                tellUsPageIOS.pressQ3_No_Checkbox();
            }else{
                tellUsPageIOS.pressQ3_Yes_Checkbox();
            }
            // Select question 4
            if(q4.trim().toLowerCase(Locale.ROOT).equals("n")){
                tellUsPageIOS.pressQ4_No_Checkbox();
            }else{
                tellUsPageIOS.pressQ4_Yes_Checkbox();
            }
        }
    }
}
