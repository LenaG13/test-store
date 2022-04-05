package components.buttons.authorize;

import org.openqa.selenium.WebDriver;

public class RegisterButton extends AuthorizeButtons {

    private static final String SIGN_BUTTON_LABEL = "submitAccount";

    public RegisterButton(WebDriver driver) {
        super(driver, SIGN_BUTTON_LABEL);
    }

}
