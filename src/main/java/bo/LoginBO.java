package bo;

import org.openqa.selenium.WebDriver;

public class LoginBO extends BaseBO {
    private static final String LOGIN = "test.kliuchkovska@gmail.com";


    public LoginBO(WebDriver driver) {
        super(driver);
    }

    public void logIn(String password) {
        getHomePage().clickOnSignInButton();
        getUserProfilePage().enterLogin(LOGIN)
                .enterPassword(password);
    }
}