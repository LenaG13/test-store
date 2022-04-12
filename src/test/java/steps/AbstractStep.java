package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AbstractPage;

public abstract class AbstractStep {

    protected WebDriver driver;

    public AbstractStep(WebDriver driver) {
        this.driver = driver;
    }

    protected void validatePageIsLoaded(AbstractPage page) {
        Assert.assertTrue(page.isPageLoaded(), page.getClass().getSimpleName().concat(" is not opened: "));
    }

}
