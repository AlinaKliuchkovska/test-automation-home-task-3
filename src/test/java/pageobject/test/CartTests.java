package pageobject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class CartTests {
//    @Test(priority = 3)
//    public void checkThatUserDataIsDisplayedInTheCart() throws InterruptedException {
//        logIn("123456789");
//
//        driver.findElement(xpath("//span[@class='sidebar-item']")).click();
//        driver.findElement(xpath("//li[contains(@class, 'sidebar')]//a[contains(@href, '/gadzhetyi1')]")).click();
//        driver.findElement(xpath("//div[@class='brand-box__title']//a[contains(@href,'/kvadrokopteryi')]")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(xpath("//a[@class='prod-cart__buy']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_cart")));
//        driver.findElement(xpath("//a[contains(@href,'/checkout')]")).click();
//        assertEquals(driver.findElement(xpath("//input[@name='name']")).getAttribute("value"), "Test");
//        assertEquals(driver.findElement(xpath("//input[@name='phone']")).getAttribute("value"), "+38(098) 749 03 15");
//        assertEquals(driver.findElement(xpath("//input[@name='email']")).getAttribute("value"), "test.kliuchkovska@gmail.com");
//
//        driver.get("https://avic.ua/");
//        driver.findElement(xpath("//div[contains(@class, 'cart active-cart')]")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("//i[@class='icon icon-close js-btn-close']"))).click();
//        driver.get("https://avic.ua/");
//        wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[contains(@class,'header-bottom__right')]//a[contains(@href,'/user-profile')]"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(xpath("//a[contains(@href,'/logout')]"))).click();
//    }
}
