package components.buttons.authorize;

import org.openqa.selenium.WebDriver;

public class NewAccountForm extends AuthorizeButton {

    private static final String SIGN_IN_BUTTON_LABEL = "Create";

    public NewAccountForm(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
