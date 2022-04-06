package steps;

import components.buttons.authorize.NewAccountButton;
import components.buttons.authorize.RegisteredButton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;
import utils.PropertiesUtils;

public class AuthenticationSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private NewAccountButton newAccountButton;
    private RegisteredButton registeredButton;
    private CreateAccountPage createAccountPage;
    private MyAccountPage myAccountPage;

    public static final String NEW_VALID_EMAIL = PropertiesUtils.getEnv("emailNew");
    public static final String VALID_EMAIL = PropertiesUtils.getEnv("email");
    public static final String VALID_PASSWORD = PropertiesUtils.getEnv("password");

    public AuthenticationSteps(WebDriver driver) {
        super(driver);
    }

    public CreateAccountSteps openCreateNewAccountPage() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        validatePageIsLoaded(authenticationPage);
        authenticationPage.createNewAccount(NEW_VALID_EMAIL);
        createAccountPage = new CreateAccountPage(driver);
        validatePageIsLoaded(createAccountPage);
        return new CreateAccountSteps(driver);
    }

    public MyAccountsSteps openRegisteredAccountPage() {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openPage();
        validatePageIsLoaded(authenticationPage);
        authenticationPage.registeredAccount(VALID_EMAIL, VALID_PASSWORD);
        myAccountPage = new MyAccountPage(driver);
        validatePageIsLoaded(myAccountPage);
        return new MyAccountsSteps(driver);
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
