package components.header.authorize;

import org.openqa.selenium.WebDriver;

public class NewAccountButton extends AuthorizeButtons {

    private static final String CREATE_BUTTON_LABEL = "SubmitCreate";

    public NewAccountButton(WebDriver driver) {
        super(driver, CREATE_BUTTON_LABEL);
    }

}
