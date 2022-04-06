package shoptest;

import model.AccountModel;
import model.PersonalInfoModel;
import org.testng.annotations.Test;
import utils.AccountModelUtils;
import utils.PersonalInfoUtils;

public class AccountTest extends BaseTest {

    @Test
    public void openAuthenticationPageTest() {
        mainSteps
                .openHomePage()
                .openAuthenticationPage();
    }

    @Test
    public void checkFormCreateNewAccountTest() {
        authenticationSteps.checkFormCreateNewAccount();
    }

    @Test
    public void checkFormRegisteredAccountTest() {
        authenticationSteps.checkFormRegisteredAccount();
    }

    @Test
    public void openCreateNewAccountPageTest() {
        authenticationSteps.openCreateNewAccountPage();
    }

    @Test
    public void openRegisteredAccountPageTest() {
        authenticationSteps.openRegisteredAccountPage();
    }

    AccountModel testAccount = AccountModelUtils.getDefaultAccountModel();
    PersonalInfoModel testPersonInfoModel= PersonalInfoUtils.getDefaultPersonalInfoModel();

    @Test
    public void addNewAccountTest() {
        mainSteps
                .openHomePage()
                .openAuthenticationPage()
                .openCreateNewAccountPage()
                .createNewAccount(testAccount);
    }

    @Test
    public void validateAccountTest() {
        authenticationSteps.openRegisteredAccountPage();
        myAccountsSteps.validatePersonalInfo(testPersonInfoModel);
    }


}
