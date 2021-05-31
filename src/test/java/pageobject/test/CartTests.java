package pageobject.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTests extends BaseTest {
    public static final String USER_NAME = "Test";
    public static final String USER_PHONE = "+38(098) 749 03 15";
    public static final String USER_EMAIL = "test.kliuchkovska@gmail.com";

    @Test
    public void checkThatUserDataIsDisplayedInTheCart() throws InterruptedException {
        getLoginBO().logIn(MAIN_PASSWORD);
        getHomePage().clickOnProductCatalogueButton()
                .clickOnGagzhetyiButton();
        getGadzhetyiPage().clickOnKvadrokopteryiButton();
        Thread.sleep(2000);
        getKvadrokopteryiPage().clickOnAddToCartButton()
                .clickOnToOrderButton();
        assertEquals(getKvadrokopteryiPage().getValueOfUserNameInCart(), USER_NAME);
        assertEquals(getKvadrokopteryiPage().getValueOfUserPhoneInCart(), USER_PHONE);
        assertEquals(getKvadrokopteryiPage().getValueOfUserEmailInCart(), USER_EMAIL);
    }

    @AfterMethod
    public void deleteItemFromCartAndLogout() {
        getDriver().get(AVIC_URL);
        getHomePage().clickOnCartButton().clickOnDeleteItemFromCartButton();
        getLogoutBO().logOut();
    }
}