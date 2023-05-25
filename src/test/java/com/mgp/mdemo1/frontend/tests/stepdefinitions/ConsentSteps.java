package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.android.ConsentPage;
import com.mgp.mdemo1.frontend.tests.pageobject.ios.ConsentPageIOS;
import io.cucumber.java.en.And;

import java.util.Locale;

public class ConsentSteps  extends BasePage {
    ConsentPage consentPageAndroid;
    ConsentPageIOS consentPageIOS;

    @And("User click on Consent checkbox with value is {string}")
    public void userClickOnConsentCheckboxWithValueIs(String consentOption) {
        boolean n = consentOption.trim().toLowerCase(Locale.ROOT).equals("n");
        if(device_running.equals("android")){
            consentPageAndroid = new ConsentPage(androidDriver);
            consentPageAndroid.waitForPageLoad();
            // Select consent option
            if(n){
                consentPageAndroid.pressNoCheckbox();
            }else{
                consentPageAndroid.pressYesCheckbox();
            }
        }else if(device_running.equals("ios")){
            consentPageIOS = new ConsentPageIOS(iosDriver);
            consentPageIOS.waitForPageLoad();
            // Select consent option
            if(n){
                consentPageIOS.pressNoCheckbox();
            }else{
                consentPageIOS.pressYesCheckbox();
            }
        }
    }
}
