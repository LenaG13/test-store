package components.header.authorize;

import components.AbstractComponent;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public abstract class AuthorizeButtons extends AbstractComponent {

    private static final String BUTTON_LOCATOR_PATTERN = "//form//button[@id='%s']";

    private String label;
    private By buttonLocator;

    public AuthorizeButtons(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.buttonLocator = By.xpath(String.format(BUTTON_LOCATOR_PATTERN, label));
    }

    public void click() {
        log.info("Click on AuthorizeButton");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(buttonLocator));
    }

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
