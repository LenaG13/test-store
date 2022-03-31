package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthenticationPage extends BasePage {

    private static final String BASE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static final By HEADER =By.xpath("//body//span[contains(text(),'Authentication')]");

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    /*private static final String LOCATOR_PATTERN = "//body//div//form/h3[contains(text(),'%s')]";
    private static final String CREATE_AN_ACCOUNT_LABEL = "Create";
    private static final String ALREADY_REGISTERED_LABEL = "Already";*/

    public static final By EMAIL_ADDRESS = By.id("email");
    public static final By PASSWORD = By.id("passwd");
    private static final By SIGN_IN_BUTTON = By.id("SubmitLogin");

    /*public AuthenticationPage newAccount(String email, String password){
        driver.findElement(EMAIL_ADDRESS).sendKeys(email);
        NewAccountForm.click();
        return this;
    }

   */

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(SIGN_IN_BUTTON));
    }

    @Override
    public BasePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public void registeredAccount(String email, String password){
        driver.findElement(EMAIL_ADDRESS).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(SIGN_IN_BUTTON).click();
    }

}
