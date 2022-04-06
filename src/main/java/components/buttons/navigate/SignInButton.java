package components.buttons.navigate;

import org.openqa.selenium.WebDriver;

public class SignInButton extends NavigateButtons {

    public static final String SIGN_IN_BUTTON_LABEL = "Log";

    public SignInButton(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
