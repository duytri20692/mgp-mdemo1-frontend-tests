package com.mgp.mdemo1.frontend.tests.stepdefinitions;

import com.mgp.mdemo1.frontend.tests.pageobject.LoginPage;
import com.mgp.mdemo1.frontend.tests.common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginSteps extends BasePage {
    LoginPage loginPage = new LoginPage(driver);

    @Given("User open the EriBank application and go to the Sign in page")
    public void userOpenTheEriBankApplicationAndGoToTheSignInPage() {
        loginPage.waitForLoginPageDisplaying();
    }

    @And("User Login to the app with valid Username and Password")
    public void userLoginToTheAppWithValidUsernameAndPassword() {
        loginPage.dismissAlert();
        loginPage.loginWithUserAndPass(loginUser,loginPass);
    }
}
