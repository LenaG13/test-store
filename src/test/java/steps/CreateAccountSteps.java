package steps;

import components.buttons.authorize.NewAccountButton;
import components.buttons.authorize.RegisterButton;
import components.buttons.authorize.RegisteredButton;
import components.forms.Dropdown;
import components.forms.Input;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.CreateAccountPage;

import static steps.AuthenticationSteps.NEW_VALID_EMAIL;


public class CreateAccountSteps extends AbstractStep{


    private AuthenticationPage authenticationPage;
    private CreateAccountPage createAccountPage;
    private RegisterButton registerButton;

    public CreateAccountSteps(WebDriver driver) {
        super(driver);
    }

    public void createNewAccount(){
        new AuthenticationPage(driver).createNewAccount(NEW_VALID_EMAIL);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertTrue(
                createAccountPage.isPageLoaded(),
                createAccountPage.getClass().getSimpleName().concat(" not displayed")
        );
        new Input(driver, "customer_firstname").insert("Test");
        new Input(driver, "customer_lastname").insert("User");
        new Input(driver, "passwd").insert("Test123");
        new Input(driver, "address1").insert("Kosmonawtow");
        new Input(driver, "city").insert("Warszawa");
        new Dropdown(driver, "id-state", "Alaska").selectOption();
        new Input(driver, "postcode").insert("01234");
        new Dropdown(driver, "id-country", "United States").selectOption();
        new Input(driver, "phone_mobile").insert("48534000000");
        registerButton.click();
    }



}
