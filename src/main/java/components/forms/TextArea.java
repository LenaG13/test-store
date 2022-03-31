package components.forms;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends BaseComponent {

    private static final String TEXT_AREA_LOCATOR_PATTERN = "//label[contains(.,'%s')]/ancestor::slot[@name='inputField']//textarea";

    private String label;
    private By texAreaLocator;

    public TextArea(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.texAreaLocator = By.xpath(String.format(TEXT_AREA_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(texAreaLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(texAreaLocator).sendKeys(text);
    }

}
