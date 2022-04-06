package steps;

import components.account.AccountDetailsComponent;

import model.AccountModel;
import model.PersonalInfoModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.MyAccountPage;

public class MyAccountsSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private MyAccountPage myAccountPage;

    public MyAccountsSteps(WebDriver driver) {
        super(driver);
    }

    public void validatePersonalInfo(PersonalInfoModel expectedPersonInfo){
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.openInformation();
        PersonalInfoModel actualPersonInfo = getActualPersonInfoAccount();
        Assert.assertEquals(
                actualPersonInfo,
                expectedPersonInfo,
                String.format("Personal information is not valid: %s", actualPersonInfo)
        );
    }

    private PersonalInfoModel getActualPersonInfoAccount() {
        PersonalInfoModel actualPersonalInfoModel = new PersonalInfoModel();
        actualPersonalInfoModel.setFirstName(new AccountDetailsComponent(driver, "firstname").getValue());
        actualPersonalInfoModel.setLastName(new AccountDetailsComponent(driver, "lastname").getValue());
        actualPersonalInfoModel.setEmail(new AccountDetailsComponent(driver, "email").getValue());
        return actualPersonalInfoModel;
    }

}
