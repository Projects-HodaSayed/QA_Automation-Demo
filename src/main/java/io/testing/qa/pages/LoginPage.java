package io.testing.qa.pages;

import io.appium.java_client.AppiumBy;
import io.testing.qa.utilities.appium.AndroidBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginPage extends AndroidBaseTest {
    WebDriverWait wait;
    private final By manuButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    private final By loginMenu = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    private final By userNameField = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]");
    private final By passwordField = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]");
    private final By loginButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]");
    private final By productsLabel = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"products screen\"]");
    private final By lockedError = AppiumBy.xpath("//android.widget.TextView[@text=\"Sorry, this user has been locked out.\"]");

    private final By notMatchedError = AppiumBy.xpath("//android.widget.TextView[@text=\"Provided credentials do not match any user in this service.\"]");

    private final By emptyUserError = AppiumBy.xpath("//android.widget.TextView[@text=\"Username is required\"]");
    private final By emptyPassError = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Password-error-message\"]");

    public void navigateToLoginPage() throws Exception {
        clickOnElement(manuButton,10);
        clickOnElement(loginMenu,10);
    }

    public void enterUserNameAndPass(String userName, String userPass) throws Exception {
        clickOnElement(userNameField,20);
        typeText(userNameField,userName,15);

        clickOnElement(passwordField,20);
        typeText(passwordField,userPass,15);
    }

    public void pressLoginButton() throws Exception {
        clickOnElement(loginButton,20);
    }

    public void userLoggedIn() throws Exception {
        Assert.assertTrue(elementIsDisplayed(productsLabel));
    }

    public boolean elementIsDisplayed(final By by) {
        try {
            waitForPresenceOf(by,20);
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void validateUserError(String errorType) {
        try {
            if(errorType == "Locked")
            {
                waitForPresenceOf(lockedError,20);
                Assert.assertTrue(driver.findElement(lockedError).getText().contains("Sorry, this user has been locked out."));
            } else if (errorType == "NotMatched") {
                waitForPresenceOf(notMatchedError,20);
                Assert.assertTrue(driver.findElement(notMatchedError).getText().contains("Provided credentials do not match any user in this service."));
            }
            else if (errorType == "EmptyUser") {
                waitForPresenceOf(emptyUserError,20);
                Assert.assertTrue(driver.findElement(emptyUserError).getText().contains("Username is required"));
            }
            else if (errorType == "EmptyPass") {
                waitForPresenceOf(emptyPassError,20);
                Assert.assertTrue(driver.findElement(emptyPassError).getText().contains("Password-error-message"));
            }
        }
        catch (Exception ex) {
                throw new RuntimeException(ex);
        }
    }
    public void typeText(final By by, final String inputText, int duration) throws Exception {
        waitForPresenceOf(by,duration);
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(inputText);
    }

    public void clickOnElement(final By by, int duration) throws Exception {
        try {
            waitForPresenceOf(by,duration);
            driver.findElement(by).click();
        } catch (Exception e) {
            throw new Exception("Failed to click on element: " + e.getMessage());
        }
    }

    protected WebElement waitForPresenceOf(By by, int duration) throws Exception {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
