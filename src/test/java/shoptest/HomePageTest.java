package shoptest;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void openHomePageTest() {
        mainSteps.openHomePage();
    }

}
