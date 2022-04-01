package components.buttons.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInButton extends NavigateButtons {

    public static final String SIGN_IN_BUTTON_LABEL = "Log";

    public SignInButton(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
