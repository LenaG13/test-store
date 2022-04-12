package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountPage extends AbstractPage {

    private static final String BASE_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account#account-creation";
    public static final By HEADER = By.xpath("//h1[contains(.,'Create an account')]");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public AbstractPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

}
