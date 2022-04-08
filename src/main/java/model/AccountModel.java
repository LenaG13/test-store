package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountModel {

    private String Title;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String Address;
    private String City;
    private String State;
    private String Zip;
    private String Country;
    private String MobilePhone;

}
