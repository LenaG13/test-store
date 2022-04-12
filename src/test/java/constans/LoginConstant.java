package constans;

import utils.PropertiesUtils;

public class LoginConstant {

    public static final String VALID_EMAIL_NEW = PropertiesUtils.getEnv("emailNew");
    public static final String VALID_EMAIL = PropertiesUtils.getEnv("email");
    public static final String VALID_PASSWORD = PropertiesUtils.getEnv("password");

}
