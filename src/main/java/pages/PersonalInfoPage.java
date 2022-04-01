package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PersonalInfoPage extends BasePage {

    private static final String BASE_URL = "http://automationpractice.com/index.php?controller=identity";

    public static final By HEADER =By.xpath("//body//span[contains(text(),'My account')]");

    public PersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(HEADER));
    }

    @Override
    public BasePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

}
