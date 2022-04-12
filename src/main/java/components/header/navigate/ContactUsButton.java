package components.header.navigate;

import org.openqa.selenium.WebDriver;

public class ContactUsButton extends NavigateButtons {

    public static final String SIGN_IN_BUTTON_LABEL = "Contact us";

    public ContactUsButton(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
