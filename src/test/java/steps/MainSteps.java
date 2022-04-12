package steps;

import components.header.navigate.SignInButton;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AuthenticationPage;
import pages.HomePage;

public class MainSteps extends AbstractStep {

    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private SignInButton signInButton;

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open Home page")
    public MainSteps openHomePage() {
        homePage = new HomePage(driver);
        homePage.openPage();
        homePage.openRefreshPage();
        validatePageIsLoaded(homePage);
        return this;
    }

    @Step("Open Authentication page")
    public AuthenticationSteps openAuthenticationPage() {
        signInButton = new SignInButton(driver);
        Assert.assertTrue(
                signInButton.isComponentDisplayed(),
                signInButton.getClass().getSimpleName().concat(" not displayed")
        );
        signInButton.click();
        authenticationPage = new AuthenticationPage(driver);
        validatePageIsLoaded(authenticationPage);
        return new AuthenticationSteps(driver);
    }

}
