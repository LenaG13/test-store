package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountModel {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;

}
