package components.buttons.authorize;

import org.openqa.selenium.WebDriver;

public class RegisteredForm extends AuthorizeButton {

    private static final String SIGN_IN_BUTTON_LABEL = "Already";

    public RegisteredForm(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }


}
