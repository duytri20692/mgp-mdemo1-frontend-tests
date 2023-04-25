package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.ConsentPage;
import io.cucumber.java.en.And;

import java.util.Locale;

public class ConsentSteps  extends BasePage {
    ConsentPage consentPage = new ConsentPage(driver);

    @And("User click on Consent checkbox with value is {string}")
    public void userClickOnConsentCheckboxWithValueIs(String consentOption) {
        // Select consent option
        if(consentOption.trim().toLowerCase(Locale.ROOT).equals("n")){
            consentPage.pressNoCheckbox();
        }else{
            consentPage.pressYesCheckbox();
        }
    }
}
