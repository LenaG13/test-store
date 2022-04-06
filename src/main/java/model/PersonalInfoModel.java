package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PersonalInfoModel {

    String Title;
    String FirstName;
    String LastName;
    String Email;

}
