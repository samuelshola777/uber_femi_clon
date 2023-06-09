package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String fullName;
    @NotNull
    @NotEmpty
    @NotBlank
    private String phoneNumber;
    @NotNull
    @NotEmpty
    @NotBlank
    private String password;
    @NotNull
    @NotEmpty
    @NotBlank
    @OneToOne(cascade = CascadeType.ALL)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Address address;
    private Gender gender;
    private RoleK roles;
    private boolean isLoggedIn;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "currentLocation_id",referencedColumnName = "currentLocation_id")
    private GeoFencing currentEnviroment;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "Driver_Ride_id",referencedColumnName = "driver_ride_id")
    private Set<Ride> ride;
    private int age;
    private LocalDateTime registrationDate = LocalDateTime.now();
    @OneToOne(cascade = {CascadeType.ALL})
    private DateK birthDateK;
   public void setAge(){
        this.age = registrationDate.getYear() -  Integer.parseInt( birthDateK.getYear());
    }

//    private String licenseId;
//    private String licenseImage;
//    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Referee referee;
//    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private BankInformation bankInformation;
//    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JsonIgnore
//    private AppUser userDetails;



}
