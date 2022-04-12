package components.header.authorize;

import org.openqa.selenium.WebDriver;

public class RegisterButton extends AuthorizeButtons {

    private static final String REGISTER_BUTTON_LABEL = "submitAccount";

    public RegisterButton(WebDriver driver) {
        super(driver, REGISTER_BUTTON_LABEL);
    }

}
