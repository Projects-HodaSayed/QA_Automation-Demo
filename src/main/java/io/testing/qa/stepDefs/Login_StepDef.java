package io.testing.qa.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testing.qa.pages.LoginPage;
import org.testng.asserts.SoftAssert;

public class Login_StepDef
{
    LoginPage login = new LoginPage();

    @When("user go to login page")
    public void usergotologinpage() {
        try {
            login.navigateToLoginPage();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("user login with User {string} and {string}")
    public void userLoginWithAnd(String user, String password) throws Exception {
        login.enterUserNameAndPass(user,password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() throws Exception {
        login.pressLoginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        try {
            login.userLoggedIn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Error returned to user {string}")
    public void userCouldNotLoginToTheSystem(String errorType)
    {
        login.validateUserError(errorType);
    }

    @Then("Logout")
    public void userLogout()
    {
        try {
            login.userLogOut();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
