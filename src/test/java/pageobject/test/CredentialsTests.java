package pageobject.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CredentialsTests extends BaseTest {
    public static final String TITLE_AFTER_SUCCESSFUL_LOGIN = "AVIC";

    @Test
    public void checkThatPasswordChangeWorksCorrect() {
        getLoginBO().logIn(MAIN_PASSWORD);
        getHomePage().clickOnUserProfileButton();
        getUserProfilePage().clickOnChangePasswordButton()
                .enterOldPassword(MAIN_PASSWORD)
                .enterNewPassword(ADDITIONAL_PASSWORD)
                .confirmNewPassword(ADDITIONAL_PASSWORD);
        getLogoutBO().logOut();
        getLoginBO().logIn(ADDITIONAL_PASSWORD);
        assertTrue(getDriver().getTitle().contains(TITLE_AFTER_SUCCESSFUL_LOGIN));
    }

    @AfterMethod
    public void reversePasswordChangeAndLogout() {
        getHomePage().clickOnUserProfileButton();
        getUserProfilePage().clickOnChangePasswordButton()
                .enterOldPassword(ADDITIONAL_PASSWORD)
                .enterNewPassword(MAIN_PASSWORD)
                .confirmNewPassword(MAIN_PASSWORD);
        getLogoutBO().logOut();
    }
}