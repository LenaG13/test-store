package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage {

    private static final String BASE_URL = "http://prestashop.qatestlab.com.ua/en/";
    public static final By HEADER = By.xpath("//div[@id='header_logo']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public AbstractPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public HomePage openRefreshPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }
}
