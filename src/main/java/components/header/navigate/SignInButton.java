package components.header.navigate;

import org.openqa.selenium.WebDriver;

public class SignInButton extends NavigateButtons {

    public static final String SIGN_IN_BUTTON_LABEL = "Sign in";

    public SignInButton(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
