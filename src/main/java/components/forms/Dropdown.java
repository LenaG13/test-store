package components.forms;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dropdown extends BaseComponent {

    private static final String DROPDOWN_LOCATOR_PATTERN =
            "//label[text()='%s']/ancestor::lightning-combobox//button";
    private String label;
    private By dropdownLocator;
    private static final String OPTION_LIST_PATTERN = "//lightning-base-combobox-item[contains(@data-value, '%s')]";
    private static final String SELECTED_OPTION_PATTERN = "//button[contains (@aria-label,'%s, %s')]";

    public Dropdown(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.dropdownLocator = By.xpath(String.format(DROPDOWN_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(dropdownLocator).isDisplayed();
    }

    private void openOptionsPopup() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(dropdownLocator));
    }

    public void selectOption(String optionName) {
        openOptionsPopup();
        By optionLocator = By.xpath(String.format(OPTION_LIST_PATTERN, optionName));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
        driver.findElement(optionLocator).click();
        By selectedOptionLocator = By.xpath((String.format(SELECTED_OPTION_PATTERN, label, optionName)));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(selectedOptionLocator));
    }

}
