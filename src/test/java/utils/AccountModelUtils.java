package utils;

import components.forms.Dropdown;
import components.forms.Input;
import model.AccountModel;

public class AccountModelUtils {

    public static AccountModel getDefaultAccountModel() {
        AccountModel accountModel = new AccountModel();
        accountModel.setFirstName("Test");
        accountModel.setLastName("User");
        accountModel.setEmail(PropertiesUtils.getEnv("email"));
        accountModel.setPassword(PropertiesUtils.getEnv("password"));
        accountModel.setAddress("Kosmonawtow");
        accountModel.setCity("Warszawa");
        accountModel.setState("Alaska");
        accountModel.setZip("01234");
        accountModel.setCountry("United States");
        accountModel.setMobilePhone("48534000000");
        return accountModel;
    }



}
