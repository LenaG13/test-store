package shoptest;

import model.AccountModel;
import model.PersonalInfoModel;
import org.testng.annotations.Test;
import constans.AccountModelConstant;
import constans.PersonalInfoConstant;

public class AccountTest extends BaseTest {

    @Test(groups = "smoke")
    public void openCreateNewAccountPageTest() {
        authenticationSteps.openCreateNewAccountPage();
    }

    @Test(groups = "smoke")
    public void openRegisteredAccountPageTest() {
        authenticationSteps.openRegisteredAccountPage();
    }

    AccountModel testAccount = AccountModelConstant.getDefaultAccountModel();
    PersonalInfoModel testPersonInfoModel = PersonalInfoConstant.getDefaultPersonalInfoModel();

    @Test(groups = "smoke")
    public void addNewAccountTest() {
        mainSteps
                .openHomePage()
                .openAuthenticationPage()
                .openCreateNewAccountPage()
                .createNewAccount(testAccount);
    }

    @Test(groups = "smoke")
    public void validateAccountTest() {
        authenticationSteps.openRegisteredAccountPage();
        myAccountsSteps.validatePersonalInfo(testPersonInfoModel);
    }

}
