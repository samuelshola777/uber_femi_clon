package africa.semicolon.uberdeluxe.data.dto.request;

import africa.semicolon.uberdeluxe.data.models.Address;
import africa.semicolon.uberdeluxe.data.models.Date;
import africa.semicolon.uberdeluxe.data.models.Gender;
import africa.semicolon.uberdeluxe.data.models.RoleK;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class DriverRequest {

    private String phoneNumber;
    private Address address;
    private Gender gender;
    private RoleK roles;
    private boolean isLoggedIn;
    private Date birthDate;
}
