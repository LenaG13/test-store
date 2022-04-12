package steps;

import components.header.authorize.RegisterButton;
import components.fields.Dropdown;
import components.fields.Input;
import io.qameta.allure.Step;
import model.AccountModel;
import model.PersonalInfoModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CreateAccountPage;
import pages.MyAccountPage;

import static constans.LoginConstant.VALID_EMAIL_NEW;

public class CreateAccountSteps extends AbstractStep {

    private CreateAccountPage createAccountPage;
    private RegisterButton registerButton;
    private MyAccountPage myAccountPage;

    public CreateAccountSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Create new Account")
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

    @Step("Fill Account form")
    private void fillAccountForm(AccountModel accountModel) {
        new Input(driver, "customer_firstname").insert(accountModel.getFirstName());
        new Input(driver, "customer_lastname").insert(accountModel.getLastName());
        new Input(driver, "passwd").insert(accountModel.getPassword());
        //new Input(driver, "address1").insert(accountModel.getAddress());
        //new Input(driver, "city").insert(accountModel.getCity());
        //new Dropdown(driver, "id_state").selectOption(accountModel.getState());
        //new Input(driver, "postcode").insert(accountModel.getZip());
        //new Dropdown(driver, "id_country").selectOption(accountModel.getCountry());
        //new Input(driver, "phone_mobile").insert(accountModel.getMobilePhone());
    }

    public static PersonalInfoModel getDefaultPersonalInfoModel() {
        PersonalInfoModel personalInfoModel = new PersonalInfoModel();
        personalInfoModel.setFirstName("Test");
        personalInfoModel.setLastName("User");
        personalInfoModel.setEmail(VALID_EMAIL_NEW);
        return personalInfoModel;
    }

}
