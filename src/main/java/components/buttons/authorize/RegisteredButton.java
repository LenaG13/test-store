package components.buttons.authorize;

import org.openqa.selenium.WebDriver;

public class RegisteredButton extends AuthorizeButtons {

    private static final String SIGN_BUTTON_LABEL = "Already";

    public RegisteredButton(WebDriver driver) {
        super(driver, SIGN_BUTTON_LABEL);
    }

}
