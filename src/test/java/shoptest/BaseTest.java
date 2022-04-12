package shoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.AuthenticationSteps;
import steps.CreateAccountSteps;
import steps.MyAccountsSteps;
import steps.MainSteps;
import utils.CapabilitiesGenerator;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected MainSteps mainSteps;
    protected AuthenticationSteps authenticationSteps;
    protected CreateAccountSteps createAccountSteps;
    protected MyAccountsSteps myAccountsSteps;

    /*@BeforeMethod(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
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
    }*/

    @BeforeMethod(alwaysRun = true)
    public void setup(ITestContext iTestContext) {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        setContextAttribute(iTestContext, "driver", driver);
        mainSteps = new MainSteps(driver);
        authenticationSteps = new AuthenticationSteps(driver);
        createAccountSteps = new CreateAccountSteps(driver);
        myAccountsSteps = new MyAccountsSteps(driver);
    }

    private void setContextAttribute(ITestContext iTestContext, String attributeKey, Object attributeValue) {
        iTestContext.setAttribute(attributeKey, attributeValue);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
