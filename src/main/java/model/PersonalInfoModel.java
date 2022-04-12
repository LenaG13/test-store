package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonalInfoModel {

    private String Title;
    private String FirstName;
    private String LastName;
    private String Email;

}
