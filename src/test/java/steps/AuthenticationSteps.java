package steps;

import components.buttons.authorize.NewAccountButton;
import components.buttons.authorize.RegisteredButton;
import components.buttons.navigate.SignInButton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.MyAccountPage;

public class AuthenticationSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private NewAccountButton newAccountButton;
    private RegisteredButton registeredButton;
    private MyAccountPage myAccountPage;

    private static final String NEW_VALID_EMAIL = "tipqn@mailkert.com";
    private static final String VALID_EMAIL = System.getProperty("email");
    private static final String VALID_PASSWORD = System.getProperty("password");

    public AuthenticationSteps(WebDriver driver) {
        super(driver);
    }

    public AuthenticationSteps openFormCreateNewAccount() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        validatePageIsLoaded(authenticationPage);
        authenticationPage.createNewAccount(NEW_VALID_EMAIL);
        return this;
    }

    public AuthenticationSteps openFormRegisteredAccount() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        validatePageIsLoaded(authenticationPage);
        authenticationPage.registeredAccount(VALID_EMAIL, VALID_PASSWORD);
        return this;
    }

    public AuthenticationSteps checkFormCreateNewAccount() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        newAccountButton = new NewAccountButton(driver);
        Assert.assertTrue(
                newAccountButton.isComponentDisplayed(),
                newAccountButton.getClass().getSimpleName().concat(" not displayed")
        );
        return this;
    }

    public AuthenticationSteps checkFormRegisteredAccount() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        registeredButton = new RegisteredButton(driver);
        Assert.assertTrue(
                registeredButton.isComponentDisplayed(),
                registeredButton.getClass().getSimpleName().concat(" not displayed")
        );
        return this;
    }

}
