package constans;

import model.PersonalInfoModel;

import static constans.LoginConstant.VALID_EMAIL;

public class PersonalInfoConstant {
    public static PersonalInfoModel getDefaultPersonalInfoModel() {
        PersonalInfoModel personalInfoModel = new PersonalInfoModel();
        personalInfoModel.setFirstName("Test");
        personalInfoModel.setLastName("User");
        personalInfoModel.setEmail(VALID_EMAIL);
        return personalInfoModel;
    }
}
