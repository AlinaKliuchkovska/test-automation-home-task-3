package pageobject.test;

import bo.LoginBO;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.Keys.ENTER;
import static org.testng.Assert.assertTrue;

public class CredentialsTests extends BaseTest {
    public static final String OLD_PASSWORD = "123456789";
    public static final String NEW_PASSWORD = "1234567890";

    @Test
    public void checkThatPasswordChangeWorksCorrect() {
        getHomePage().clickOnSignInButton();
        getLoginBO().logIn(OLD_PASSWORD);
        getHomePage().clickOnUserProfileButton();
        getUserProfilePage().clickOnChangePasswordButton()
                .waitForVisibilityOfElement(getUserProfilePage().getChangePasswordPopup());
        getUserProfilePage().enterOldPassword(OLD_PASSWORD)
                .enterNewPassword(NEW_PASSWORD)
                .confirmNewPassword(NEW_PASSWORD)
                .waitForVisibilityOfElement(getUserProfilePage().getInfoPopup());
        getUserProfilePage().clickOnCloseInfoPopupButton()
                .clickOnLogoutButton();
        getHomePage().clickOnSignInButton();
        getLoginBO().logIn(NEW_PASSWORD);

        assertTrue(getDriver().getTitle().contains("AVIC"));

        driver.findElement(xpath("//div[contains(@class,'header-bottom__right')]//a[contains(@href,'/user-profile')]")).click();
        actions.moveToElement(driver.findElement(xpath("//a[contains(@href,'changePassword')]"))).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_changePassword")));
        driver.findElement(xpath("//input[@name='old_password']")).sendKeys("1234567890", ENTER);
        driver.findElement(xpath("//input[@name='password']")).sendKeys("123456789", ENTER);
        driver.findElement(xpath("//input[@name='password_confirmation']")).sendKeys("123456789", ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modalAlert")));
        driver.findElement(xpath("//button[contains(@class,'fancybox-close')]")).click();
        driver.findElement(xpath("//a[contains(@href,'/logout')]")).click();
    }
}
