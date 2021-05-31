package bo;

import org.openqa.selenium.WebDriver;
import pageobject.HomePage;
import pageobject.UserProfilePage;

public class BaseBO {
    private WebDriver driver;
    private HomePage homePage;
    private UserProfilePage userProfilePage;

    public BaseBO(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        userProfilePage = new UserProfilePage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public UserProfilePage getUserProfilePage() {
        return userProfilePage;
    }
}