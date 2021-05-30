package pageobject.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertTrue;

public class FiltersTests extends BaseTest{
//    @Test(priority = 4)
//    public void testOnlyAvailableItemCheckBox() {
//        driver.findElement(xpath("//span[@class='sidebar-item']")).click();
//        driver.findElement(xpath("//li[contains(@class, 'sidebar')]//a[contains(@href, '/gadzhetyi1')]")).click();
//        driver.findElement(xpath("//div[@class='brand-box__title']//a[contains(@href,'/kvadrokopteryi')]")).click();
//        driver.findElement(xpath("//label[contains(text(), 'Тільки товари у наявності')]")).click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("scroll(0, 250);");
//        List<WebElement> pagesOfAvailableItems = driver.findElements(xpath("//li[@class='page-item']"));
//        pagesOfAvailableItems.get(pagesOfAvailableItems.size() - 1).click();
//        List<WebElement> onlyAvailableItems = driver.findElements(xpath("//div[@class='item-prod col-lg-3']"));
//        for (WebElement item : onlyAvailableItems) {
//            assertTrue(item.findElement(xpath("//a[@class='prod-cart__buy']")).isEnabled());
//        }
//    }
}
