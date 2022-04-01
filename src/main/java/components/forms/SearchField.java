package components.forms;

import components.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchField extends AbstractComponent {

    private static final String SEARCH_INPUT_LOCATOR_PATTERN = "//label[text() = '%s']/ancestor::lightning-grouped-combobox//div[@lightning-basecombobox_basecombobox]//input";
    private static final String OPTION_LIST_PATTERN = "//div[@lightning-basecombobox_basecombobox]//span[@title='%s']";
    private static final String SELECTED_OPTION_PATTERN = " //input[@lightning-basecombobox_basecombobox and contains (@data-value, '%s')]";

    private String label;
    private By searchLocator;

    public SearchField(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.searchLocator = By.xpath(String.format(SEARCH_INPUT_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(searchLocator).isDisplayed();
    }

    private void openOptionsArea() {
        driver.findElement(searchLocator).click();
    }

    public void selectOption(String optionName) {
        openOptionsArea();
        By optionLocator = By.xpath(String.format(OPTION_LIST_PATTERN, optionName));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
        driver.findElement(optionLocator).click();
        By selectedOptionLocator = By.xpath(String.format(SELECTED_OPTION_PATTERN, optionName));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(selectedOptionLocator));
    }

}
