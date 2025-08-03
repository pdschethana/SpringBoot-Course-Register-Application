package lk.ijse.cmjd110.courseRegisterPro.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

// to override the toString method
public class UserDto implements Serializable {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String password;
    private Role role;
}
