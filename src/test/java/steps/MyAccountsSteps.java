package steps;

import org.openqa.selenium.WebDriver;
import pages.AuthenticationPage;
import pages.MyAccountPage;

public class MyAccountsSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private MyAccountPage myAccountPage;

    public MyAccountsSteps(WebDriver driver) {
        super(driver);
    }

}
