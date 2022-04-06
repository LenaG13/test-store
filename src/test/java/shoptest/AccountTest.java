package shoptest;

import org.testng.annotations.Test;

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

    @Test
    public void addNewAccountTest() {
        mainSteps
                .openHomePage()
                .openAuthenticationPage()
                .openCreateNewAccountPage()
                .createNewAccount();
        //.validateAccount();
    }

    @Test
    public void checkAccountTest() {
        authenticationSteps.openRegisteredAccountPage();
        myAccountsSteps.validateAccount();
    }


}
