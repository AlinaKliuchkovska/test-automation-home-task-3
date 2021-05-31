package pageobject.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class FiltersTests extends BaseTest {
    @Test
    public void testOnlyAvailableItemCheckBox() {
        getHomePage().clickOnProductCatalogueButton()
                .clickOnGagzhetyiButton();
        getGadzhetyiPage().clickOnKvadrokopteryiButton();
        getKvadrokopteryiPage().checkOnlyAvailableItemCheckBox()
                .moveToTheLastPageOfAvailableItems();
        for (WebElement item : getKvadrokopteryiPage().getOnlyAvailableItems()) {
            assertTrue(getKvadrokopteryiPage().isAddToCartButtonEnabled(item));
        }
    }
}