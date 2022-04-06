package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage {

    private static final String BASE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static final By HEADER =By.xpath("//body//h1[contains(text(),'My account')]");

    private static final By INFORMATION_BUTTON = By.xpath("//a[@title='Information']");
    public static final By LOCATOR_INFORMATION =By.xpath("//body//div//h1[contains(text(),'information')]");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public BasePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public void openInformation() {
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
