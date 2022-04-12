package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AuthenticationPage extends AbstractPage {

    private static final String BASE_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account";
    public static final By HEADER = By.xpath("//h1[contains(.,'Authentication')]");

    public static final By EMAIL_CREATE = By.id("email_create");
    public static final By CREATE_ACCOUNT_BUTTON = By.id("SubmitCreate");

    public static final By EMAIL_ADDRESS = By.id("email");
    public static final By PASSWORD = By.id("passwd");
    public static final By SIGN_IN_BUTTON = By.id("SubmitLogin");

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public AbstractPage openPage() {
        log.info("Insert [{}] into [{}] field", BASE_URL, "url");
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
