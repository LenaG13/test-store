package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseComponent {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;

    public BaseComponent(WebDriver driver) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    abstract public boolean isComponentDisplayed();

}
