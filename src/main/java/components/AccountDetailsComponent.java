package components;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountDetailsComponent extends AbstractComponent {

    private static final String ACCOUNT_TEXT_DATA_FIELD = "//form//input[@id='%s']";
    private String label;
    private By textFieldLocator;

    public AccountDetailsComponent(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.textFieldLocator = By.xpath(String.format(ACCOUNT_TEXT_DATA_FIELD, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public String getValue() {
        return driver.findElement(textFieldLocator).getAttribute("value");
    }

}
