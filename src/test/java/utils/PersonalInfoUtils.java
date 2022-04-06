package utils;

import model.PersonalInfoModel;

public class PersonalInfoUtils {
    public static PersonalInfoModel getDefaultPersonalInfoModel() {
        PersonalInfoModel personalInfoModel = new PersonalInfoModel();
        personalInfoModel.setFirstName("Test");
        personalInfoModel.setLastName("User");
        personalInfoModel.setEmail(PropertiesUtils.getEnv("email"));
        return personalInfoModel;
    }
}
