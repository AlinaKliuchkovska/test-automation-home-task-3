package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class KvadrokopteryiPage extends BasePage {
    @FindBy(xpath = "//div[@class='category-top']//select[contains(@class, 'sort')]")
    private WebElement sortingTypeDropdown;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    List<WebElement> pricesOfElementsWebElements;

    @FindBy(id = "js_cart")
    private WebElement cartPopup;

    @FindBy(xpath = "//a[contains(@href,'/checkout')]")
    private WebElement toOrderButton;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement userPhoneInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement userEmailInput;

    @FindBy(xpath = "//label[contains(text(), 'Тільки товари у наявності')]")
    private WebElement onlyAvailableItemCheckBox;

    @FindBy(xpath = "//li[@class='page-item']")
    List<WebElement> pagesOfAvailableItems;

    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    List<WebElement> onlyAvailableItems;

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addToCartButton;

    public KvadrokopteryiPage(WebDriver driver) {
        super(driver);
    }

    public void selectSortingType(String sortingType) {
        Select sortingTypeSelect = new Select(sortingTypeDropdown);
        sortingTypeSelect.selectByVisibleText(sortingType);
    }

    public List<String> getPricesOfElements() {
        List<String> pricesOfElements = new ArrayList<>();
        for (WebElement price : pricesOfElementsWebElements) {
            pricesOfElements.add(price.getText().replace("грн", ""));
        }
        return pricesOfElements;
    }

    public WebElement getCartPopup() {
        return cartPopup;
    }

    public void clickOnToOrderButton() {
        toOrderButton.click();
    }

    public String getValueOfUserNameInCart() {
        return userNameInput.getAttribute("value");
    }

    public String getValueOfUserPhoneInCart() {
        return userPhoneInput.getAttribute("value");
    }

    public String getValueOfUserEmailInCart() {
        return userEmailInput.getAttribute("value");
    }

    public void checkOnlyAvailableItemCheckBox() {
        onlyAvailableItemCheckBox.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.get(0).click();
    }
}