package shoptest;

import org.testng.annotations.Test;

public class AddAccountTest extends BaseTest{

    @Test
    public void openHomePageTest() {
        mainSteps.openHomePage();
    }

    @Test
    public void openAuthenticationPageTest() {
        mainSteps.openAuthenticationPage();
    }

}
