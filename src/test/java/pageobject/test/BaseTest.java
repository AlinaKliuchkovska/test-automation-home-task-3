package pageobject.test;

import bo.LoginBO;
import bo.LogoutBO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobject.GadzhetyiPage;
import pageobject.HomePage;
import pageobject.KvadrokopteryiPage;
import pageobject.UserProfilePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    public static final String AVIC_URL = "https://avic.ua/";
    public static final String MAIN_PASSWORD = "123456789";
    public static final String ADDITIONAL_PASSWORD = "1234567890";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public LoginBO getLoginBO() {
        return new LoginBO(driver);
    }

    public LogoutBO getLogoutBO() {
        return new LogoutBO(driver);
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public UserProfilePage getUserProfilePage() {
        return new UserProfilePage(driver);
    }

    public GadzhetyiPage getGadzhetyiPage() {
        return new GadzhetyiPage(driver);
    }

    public KvadrokopteryiPage getKvadrokopteryiPage() {
        return new KvadrokopteryiPage(driver);
    }
}
