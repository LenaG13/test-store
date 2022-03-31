package components.buttons.authorize;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorizeButton extends BaseComponent {

    private static final String BUTTON_LOCATOR_PATTERN = "//body//div//form/h3[contains(text(),'%s')]";

    private String label;
    private By buttonLocator;

    public AuthorizeButton(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.buttonLocator = By.xpath(String.format(BUTTON_LOCATOR_PATTERN, label));
    }

    /*public static void click() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(buttonLocator));
    }*/

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }
}
