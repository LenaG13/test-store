package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends AbstractPage {

    private static final String BASE_URL = "http://prestashop.qatestlab.com.ua/en/my-account";
    public static final By HEADER = By.xpath("//h1[contains(.,'My account')]");

    private static final By INFORMATION_BUTTON = By.xpath("//a[@title='Information']");
    public static final By LOCATOR_INFORMATION = By.xpath("//body//div//h1[contains(text(),'information')]");

    Logger log = LogManager.getLogger(AuthenticationPage.class);

    public MyAccountPage(WebDriver driver) {
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

    public void openInformation() {
        log.info("Click [{}] button", "My personal information");
        driver.findElement(INFORMATION_BUTTON).click();
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(LOCATOR_INFORMATION));
    }

    /*private static final String BUTTON_LOCATOR_PATTERN = "//a[@title='%s']";
    private By buttonLocator;
    // Orders   //Credit slips  //Addresses  //Information  //My wishlists
    public void clickToButtonsMyAccountPage(String label) {
        buttonLocator = By.xpath(String.format(BUTTON_LOCATOR_PATTERN, label));
        driver.findElement(buttonLocator).click();
    }*/

}
