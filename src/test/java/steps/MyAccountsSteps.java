package steps;

import components.AccountDetailsComponent;
import io.qameta.allure.Step;
import model.PersonalInfoModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MyAccountPage;

public class MyAccountsSteps extends AbstractStep {

    private MyAccountPage myAccountPage;

    public MyAccountsSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Validate Personal Info from RegisteredAccount")
    public void validatePersonalInfo(PersonalInfoModel expectedPersonInfo){
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.openInformation();
        PersonalInfoModel actualPersonInfo = getActualPersonInfoAccount();
        Assert.assertEquals(
                actualPersonInfo,
                expectedPersonInfo,
                String.format("Personal information is not valid: %s", actualPersonInfo)
        );
    }

    @Step("Get Actual Personal Info")
    private PersonalInfoModel getActualPersonInfoAccount() {
        PersonalInfoModel actualPersonInfo = PersonalInfoModel.builder()
                .FirstName(new AccountDetailsComponent(driver, "firstname").getValue())
                .LastName(new AccountDetailsComponent(driver, "lastname").getValue())
                .Email(new AccountDetailsComponent(driver, "email").getValue())
                .build();
        return actualPersonInfo;
    }

}
