package shoptest;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest{

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
}
