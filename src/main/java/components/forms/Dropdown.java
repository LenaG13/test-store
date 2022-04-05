package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dropdown extends AbstractComponent {

    private static final String DROPDOWN_LOCATOR_PATTERN = "//body//div//form//select[@id='%s']";
    private static final String OPTION_LIST_PATTERN = "//body//div//form//select[@id='%s']/option[contains(.,'%s')]";

    private final By optionLocator;
    private final By dropDownLocator;

    public Dropdown(WebDriver driver, String label, String optionName) {
        super(driver);
        this.optionLocator = By.xpath(String.format(OPTION_LIST_PATTERN, label, optionName));
        this.dropDownLocator = By.xpath(String.format(DROPDOWN_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(dropDownLocator).isDisplayed();
    }

    private void openOptionsPopup() {
        driver.findElement(dropDownLocator).click();
    }

    public void selectOption() {
        openOptionsPopup();
        By option = optionLocator;
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(option));
        driver.findElement(option).click();
    }
}
