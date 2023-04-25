package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.common.BasePage;
import com.mgp.mdemo1.frontend.tests.pageobject.CongratulationsPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class CongratulationsSteps extends BasePage {
    CongratulationsPage congratulationsPage = new CongratulationsPage(driver);

    @And("User should see the Congratulations page")
    public void userShouldSeeTheCongratulationsPage() {
        congratulationsPage.waitForPageLoad();
    }

    @And("User should see the Congratulations message as {string}")
    public void userShouldSeeTheCongratulationsMessageAs(String congraMsg) {
        Assert.assertEquals(congratulationsPage.getCongratulationsText(), congraMsg);
    }
}
