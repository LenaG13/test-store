package steps;

import org.openqa.selenium.WebDriver;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;

public class MainSteps extends AbstractStep {

    private HomePage homePage;
    private AuthenticationPage loginPage;
    private MyAccountPage accountPage;


    private static final String VALID_EMAIL = System.getProperty("email");
    private static final String VALID_PASSWORD = System.getProperty("password");

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    public MainSteps openHomePage() {
        homePage = new HomePage(driver);
        homePage.openPage();
        validatePageIsLoaded(homePage);
        return this;
    }

    public MainSteps openAuthenticationPage() {
        loginPage = new AuthenticationPage(driver);
        loginPage.openPage();
        validatePageIsLoaded(loginPage);
        loginPage.registeredAccount(VALID_EMAIL, VALID_PASSWORD);
        return this;
    }

}
