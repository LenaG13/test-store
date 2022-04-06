package steps;

import components.buttons.authorize.RegisterButton;
import components.buttons.authorize.RegisteredButton;
import components.forms.Dropdown;
import components.forms.Input;
import model.AccountModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MyAccountPage;

public class CreateAccountSteps extends AbstractStep {

    private AuthenticationPage authenticationPage;
    private CreateAccountPage createAccountPage;
    private RegisterButton registerButton;
    private MyAccountPage myAccountPage;

    public CreateAccountSteps(WebDriver driver) {
        super(driver);
    }

    public CreateAccountSteps createNewAccount(AccountModel accountModel) {
        createAccountPage = new CreateAccountPage(driver);
        Assert.assertTrue(
                createAccountPage.isPageLoaded(),
                createAccountPage.getClass().getSimpleName().concat(" not displayed")
        );
        fillAccountForm(accountModel);
        registerButton = new RegisterButton(driver);
        registerButton.click();
        myAccountPage = new MyAccountPage(driver);
        validatePageIsLoaded(myAccountPage);
        return this;
    }

    private void fillAccountForm(AccountModel accountModel) {
        new Input(driver, "customer_firstname").insert(accountModel.getFirstName());
        new Input(driver, "customer_lastname").insert(accountModel.getLastName());
        new Input(driver, "passwd").insert(accountModel.getPassword());
        new Input(driver, "address1").insert(accountModel.getAddress());
        new Input(driver, "city").insert(accountModel.getCity());
        new Dropdown(driver, "id_state").selectOption(accountModel.getState());
        new Input(driver, "postcode").insert(accountModel.getZip());
        new Dropdown(driver, "id_country").selectOption(accountModel.getCountry());
        new Input(driver, "phone_mobile").insert(accountModel.getMobilePhone());
    }

}
