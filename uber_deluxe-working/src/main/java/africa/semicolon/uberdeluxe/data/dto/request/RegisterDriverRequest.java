package africa.semicolon.uberdeluxe.data.dto.request;


import africa.semicolon.uberdeluxe.data.models.Address;
import africa.semicolon.uberdeluxe.data.models.AppUser;
import africa.semicolon.uberdeluxe.data.models.Gender;
import africa.semicolon.uberdeluxe.data.models.Ride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

import static africa.semicolon.uberdeluxe.util.AppUtilities.EMAIL_REGEX_STRING;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterDriverRequest {

    @NotNull(message = "field name cannot be null")
    @NotEmpty(message = "field name cannot be empty")
    private String name;

    @NotNull(message = "field email cannot be null")
    @NotEmpty(message = "field email cannot be empty")
    @Email(message = "must be valid email address", regexp = EMAIL_REGEX_STRING)
    private String email;

    @Size(min = 8, max = 20)
    @NotEmpty
    @NotNull
    private String password;
    private Address address;
    private Gender gender;
    private int age;
    private AppUser user;
    private Set<Ride> ride;

//    @NotNull(message = "please upload license image")
//    private MultipartFile licenseImage;
}
