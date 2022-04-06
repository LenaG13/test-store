package steps;

import components.account.AccountDetailsComponent;
import components.forms.Dropdown;
import components.forms.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;

import static steps.AuthenticationSteps.NEW_VALID_EMAIL;

public class MyAccountsSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private MyAccountPage myAccountPage;

    public MyAccountsSteps(WebDriver driver) {
        super(driver);
    }

    public void validateAccount(){
        myAccountPage.openInformation();
        Assert.assertEquals(
                new AccountDetailsComponent(driver, "firstname").getValue(),
                " "
        );
        Assert.assertEquals(
                new AccountDetailsComponent(driver, "lastname").getValue(),
                " "
        );

    }

}
