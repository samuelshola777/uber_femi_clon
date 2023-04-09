package africa.semicolon.uberdeluxe.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    private String phoneNumber;
    @OneToOne
    private Address address;
    private Gender gender;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "currentLocation_id",referencedColumnName = "currentLocation_id")
    private GeoFencing geoFencing;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "Driver_Ride_id",referencedColumnName = "driver_ride_id")
    private Set<Ride> ride;
    private RoleK roles;
    private boolean isLoggedIn;
    private int age;
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
