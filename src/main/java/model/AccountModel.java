package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AccountModel {

    String Title;
    String FirstName;
    String LastName;
    String Address;
    String City;
    String State;
    String Zip;
    String Country;
    String MobilePhone;

}
