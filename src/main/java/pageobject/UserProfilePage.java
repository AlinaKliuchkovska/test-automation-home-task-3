package pageobject;

import org.graalvm.compiler.lir.LIRInstruction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage {
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='login']")
    private WebElement loginInput;

    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(id = "modalAlert")
    private WebElement infoPopup;

    @FindBy(xpath = "//button[contains(@class,'fancybox-close')]")
    private WebElement closeInfoPopupButton;

    @FindBy(xpath = "//a[contains(@href,'changePassword')]")
    private WebElement changePasswordButton;

    @FindBy(id = "js_changePassword")
    private WebElement changePasswordPopup;

    @FindBy(xpath = "//input[@name='old_password']")
    private WebElement oldPasswordInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement newPasswordInput;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    private WebElement confirmNewPasswordInput;

    @FindBy(xpath = "//a[contains(@href,'/logout')]")
    private WebElement logoutButton;

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    public UserProfilePage enterLogin(final String login) {
        loginInput.sendKeys(login, Keys.ENTER);
        return this;
    }

    public UserProfilePage enterPassword(final String password) {
        passwordInput.sendKeys(password, Keys.ENTER);
        return this;
    }

    public WebElement getInfoPopup() {
        return infoPopup;
    }

    public UserProfilePage clickOnCloseInfoPopupButton(){
        closeInfoPopupButton.click();
        return this;
    }

    public UserProfilePage clickOnChangePasswordButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(changePasswordButton).click().perform();
        return this;
    }

    public WebElement getChangePasswordPopup() {
        return changePasswordPopup;
    }

    public UserProfilePage enterOldPassword(final String oldPassword) {
        oldPasswordInput.sendKeys(oldPassword, Keys.ENTER);
        return this;
    }

    public UserProfilePage enterNewPassword(final String newPassword) {
        newPasswordInput.sendKeys(newPassword, Keys.ENTER);
        return this;
    }

    public UserProfilePage confirmNewPassword(final String newPassword) {
        confirmNewPasswordInput.sendKeys(newPassword, Keys.ENTER);
        return this;
    }

    public UserProfilePage clickOnLogoutButton(){
        logoutButton.click();
        return this;
    }
}
