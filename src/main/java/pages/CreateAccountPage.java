package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class CreateAccountPage extends AbstractPage {

    private static final String BASE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
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
        log.info("Open [{}] url", BASE_URL);
        driver.get(BASE_URL);
        return this;
    }

}
