package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GadzhetyiPage extends BasePage {
    @FindBy(xpath = "//div[@class='brand-box__title']//a[contains(@href,'/kvadrokopteryi')]")
    private WebElement kvadrokopteryiButton;

    public GadzhetyiPage(WebDriver driver) {
        super(driver);
    }

    public GadzhetyiPage clickOnKvadrokopteryiButton(){
        kvadrokopteryiButton.click();
        return this;
    }
}