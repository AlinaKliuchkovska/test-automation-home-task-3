package bo;

import org.openqa.selenium.WebDriver;

public class LogoutBO extends BaseBO {
    public static final String AVIC_URL = "https://avic.ua/";

    public LogoutBO(WebDriver driver) {
        super(driver);
    }

    public void logOut() {
        getDriver().get(AVIC_URL);
        getHomePage().clickOnUserProfileButton();
        getUserProfilePage().clickOnLogoutButton();
    }
}