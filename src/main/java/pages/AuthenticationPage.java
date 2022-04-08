package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class AuthenticationPage extends BasePage {

    private static final String BASE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static final By HEADER = By.xpath("//body//span[contains(text(),'Authentication')]");

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public static final By EMAIL_CREATE = By.id("email_create");
    private static final By CREATE_ACCOUNT_BUTTON = By.id("SubmitCreate");

    public static final By EMAIL_ADDRESS = By.id("email");
    public static final By PASSWORD = By.id("passwd");
    private static final By SIGN_IN_BUTTON = By.id("SubmitLogin");

    Logger log = LogManager.getLogger(AuthenticationPage.class);

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public BasePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public void createNewAccount(String emailNew) {
        log.info("Insert[{}] into[{}] field", emailNew, "emailNew");
        driver.findElement(EMAIL_CREATE).sendKeys(emailNew);
        log.info("Click [{}] button", "Create an account");
        driver.findElement(CREATE_ACCOUNT_BUTTON).click();
    }

    public void registeredAccount(String email, String password) {
        log.info("Insert[{}] into[{}] field", email, "email");
        driver.findElement(EMAIL_ADDRESS).sendKeys(email);
        log.info("Insert[{}] into[{}] field", "*****", "password");
        driver.findElement(PASSWORD).sendKeys(password);
        log.info("Click [{}] button", "Sign in");
        driver.findElement(SIGN_IN_BUTTON).click();
    }

}
