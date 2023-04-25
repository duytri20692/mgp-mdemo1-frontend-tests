package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.TellUsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;

public class TellUsSteps extends BasePage {
    TellUsPage tellUsPage = new TellUsPage(driver);

    @Then("Click on the Next button")
    public void clickOnTheNextButton() {
        tellUsPage.pressNextButton();
    }

    @When("User select answers as {string}, {string}, {string} and {string}")
    public void userSelectAnswersAsAnd(String q1, String q2, String q3, String q4) {
        // Select question 1
        if(q1.trim().toLowerCase(Locale.ROOT).equals("n")){
            tellUsPage.pressQ1_Other_Checkbox();
        }else{
            tellUsPage.pressQ1_HouseOrCondo_Checkbox();
        }
        // Select question 2
        if(q2.trim().toLowerCase(Locale.ROOT).equals("n")){
            tellUsPage.pressQ2_No_Checkbox();
        }else{
            tellUsPage.pressQ2_Yes_Checkbox();
        }
        // Select question 3
        if(q3.trim().toLowerCase(Locale.ROOT).equals("n")){
            tellUsPage.pressQ3_No_Checkbox();
        }else{
            tellUsPage.pressQ3_Yes_Checkbox();
        }
        // Select question 4
        if(q4.trim().toLowerCase(Locale.ROOT).equals("n")){
            tellUsPage.pressQ4_No_Checkbox();
        }else{
            tellUsPage.pressQ4_Yes_Checkbox();
        }
    }
}
