package pageobject.test;

import com.google.common.collect.Ordering;

import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class SortingTests extends BaseTest {
    private static final String SORTING_TYPE = "За зменшенням";

    @Test
    public void checkThatElementsSortedInReverseOrder() {
        getHomePage().clickOnProductCatalogueButton()
                .clickOnGagzhetyiButton();
        getGadzhetyiPage().clickOnKvadrokopteryiButton();
        getKvadrokopteryiPage().selectSortingType(SORTING_TYPE);
        assertTrue(Ordering.natural().reverse().isOrdered(getKvadrokopteryiPage().getPricesOfElements()));
    }
}