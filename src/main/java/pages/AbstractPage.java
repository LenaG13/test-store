package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait explicitlyWait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.explicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    abstract public void waitPageLoaded();

    abstract public AbstractPage openPage();

    public boolean isPageLoaded() {
        try {
            waitPageLoaded();
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

}
