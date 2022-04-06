package shoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import steps.AuthenticationSteps;
import steps.CreateAccountSteps;
import steps.MyAccountsSteps;
import steps.MainSteps;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected MainSteps mainSteps;
    protected AuthenticationSteps authenticationSteps;
    protected CreateAccountSteps createAccountSteps;
    protected MyAccountsSteps myAccountsSteps;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--ignore-popup-blocking");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        mainSteps = new MainSteps(driver);
        authenticationSteps = new AuthenticationSteps(driver);
        createAccountSteps = new CreateAccountSteps(driver);
        myAccountsSteps = new MyAccountsSteps(driver);

    }


    /*@AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }*/

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
