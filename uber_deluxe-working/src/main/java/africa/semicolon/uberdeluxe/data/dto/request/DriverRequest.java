package africa.semicolon.uberdeluxe.data.dto.request;

import africa.semicolon.uberdeluxe.data.models.Address;
import africa.semicolon.uberdeluxe.data.models.DateK;
import africa.semicolon.uberdeluxe.data.models.Gender;
import africa.semicolon.uberdeluxe.data.models.RoleK;
import lombok.Data;

@Data
public class DriverRequest {
    private String fullName;
    private String phoneNumber;
    private Address address;
    private Gender gender;
    private RoleK roles;
    private  String password;
    private DateK birthDateK;
    private int age;


}
