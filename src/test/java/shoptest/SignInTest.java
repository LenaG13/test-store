package shoptest;

import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test(groups = "smoke")
    public void openHomePageTest() {
        mainSteps.openHomePage();
    }

    @Test(groups = "smoke")
    public void openAuthenticationPageTest() {
        mainSteps
                .openHomePage()
                .openAuthenticationPage();
    }

    @Test(groups = "smoke")
    public void checkFormCreateNewAccountTest() {
        authenticationSteps.checkFormCreateNewAccount();
    }

    @Test(groups = "smoke")
    public void checkFormRegisteredAccountTest() {
        authenticationSteps.checkFormRegisteredAccount();
    }

}
