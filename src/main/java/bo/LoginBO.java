package bo;

import org.openqa.selenium.WebDriver;
import pageobject.UserProfilePage;

public class LoginBO {
    private WebDriver driver;
    private static final String LOGIN = "test.kliuchkovska@gmail.com";

    public LoginBO(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn(String password) {
        UserProfilePage userProfilePage = new UserProfilePage(driver);
        userProfilePage.enterLogin(LOGIN);
        userProfilePage.enterPassword(password);
        userProfilePage.waitForVisibilityOfElement(userProfilePage.getInfoPopup());
        userProfilePage.clickOnCloseInfoPopupButton();
    }
}