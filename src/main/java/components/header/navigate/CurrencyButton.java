package components.header.navigate;

import org.openqa.selenium.WebDriver;

public class CurrencyButton extends NavigateButtons {

    public static final String SIGN_IN_BUTTON_LABEL = "Currency";

    public CurrencyButton(WebDriver driver) {
        super(driver, SIGN_IN_BUTTON_LABEL);
    }

}
