package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'header-bottom__right')]//a[contains(@href,'/sign-in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__right')]//a[contains(@href,'/user-profile')]")
    private WebElement userProfileButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogueButton;

    @FindBy(xpath = "//li[contains(@class, 'sidebar')]//a[contains(@href, '/gadzhetyi1')]")
    private WebElement gagzhetyiButton;

    @FindBy(xpath = "//div[contains(@class, 'cart active-cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//i[@class='icon icon-close js-btn-close']")
    private WebElement deleteItemFromCartButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnSignInButton() {
        signInButton.click();
        return this;
    }

    public HomePage clickOnUserProfileButton() {
        waitForClickableOfElement(userProfileButton);
        userProfileButton.click();
        return this;
    }

    public HomePage clickOnProductCatalogueButton() {
        productCatalogueButton.click();
        return this;
    }

    public HomePage clickOnGagzhetyiButton() {
        gagzhetyiButton.click();
        return this;
    }

    public HomePage clickOnCartButton() {
        cartButton.click();
        return this;
    }

    public HomePage clickOnDeleteItemFromCartButton(){
        waitForClickableOfElement(deleteItemFromCartButton);
        deleteItemFromCartButton.click();
        return this;
    }
}