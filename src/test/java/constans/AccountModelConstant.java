package constans;

import model.AccountModel;

import static constans.LoginConstant.VALID_EMAIL;
import static constans.LoginConstant.VALID_PASSWORD;

public class AccountModelConstant {

    public static AccountModel getDefaultAccountModel() {
        AccountModel accountModel = new AccountModel();
        accountModel.setFirstName("Test");
        accountModel.setLastName("User");
        accountModel.setEmail(VALID_EMAIL);
        accountModel.setPassword(VALID_PASSWORD);
        return accountModel;
    }

}
