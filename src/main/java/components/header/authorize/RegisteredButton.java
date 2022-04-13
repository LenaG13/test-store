package components.header.authorize;

import org.openqa.selenium.WebDriver;

public class RegisteredButton extends AuthorizeButtons {

    private static final String SIGN_BUTTON_LABEL = "Sign in";

    public RegisteredButton(WebDriver driver) {
        super(driver, SIGN_BUTTON_LABEL);
    }

}
