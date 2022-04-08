package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonalInfoModel {

    String Title;
    String FirstName;
    String LastName;
    String Email;

}
