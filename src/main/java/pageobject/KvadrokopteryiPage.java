package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class KvadrokopteryiPage extends BasePage {
    public static final String ADD_TO_CART_BUTTON = "//a[@class='prod-cart__buy']";

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
    private List<WebElement> pagesOfAvailableItems;

    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> onlyAvailableItems;

    @FindBy(xpath = ADD_TO_CART_BUTTON)
    private List<WebElement> addToCartButton;

    public KvadrokopteryiPage(WebDriver driver) {
        super(driver);
    }

    public KvadrokopteryiPage selectSortingType(String sortingType) {
        Select sortingTypeSelect = new Select(sortingTypeDropdown);
        sortingTypeSelect.selectByVisibleText(sortingType);
        return this;
    }

    public List<String> getPricesOfElements() {
        List<String> pricesOfElements = new ArrayList<>();
        for (WebElement price : pricesOfElementsWebElements) {
            pricesOfElements.add(price.getText().replace("грн", ""));
        }
        return pricesOfElements;
    }

    public KvadrokopteryiPage clickOnToOrderButton() {
        toOrderButton.click();
        return this;
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

    public List<WebElement> getOnlyAvailableItems() {
        return onlyAvailableItems;
    }

    public KvadrokopteryiPage checkOnlyAvailableItemCheckBox() {
        onlyAvailableItemCheckBox.click();
        return this;
    }

    public KvadrokopteryiPage clickOnAddToCartButton() {
        addToCartButton.get(0).click();
        waitForVisibilityOfElement(cartPopup);
        return this;
    }

    public KvadrokopteryiPage moveToTheLastPageOfAvailableItems() {
        scrollDown();
        pagesOfAvailableItems.get(pagesOfAvailableItems.size() - 1).click();
        return this;
    }

    public boolean isAddToCartButtonEnabled(WebElement item) {
        return item.findElement(xpath(ADD_TO_CART_BUTTON)).isEnabled();
    }
}