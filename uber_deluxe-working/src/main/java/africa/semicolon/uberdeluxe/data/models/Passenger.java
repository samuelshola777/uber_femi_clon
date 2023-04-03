package africa.semicolon.uberdeluxe.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @OneToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST})
    @JsonIgnore
    @JsonUnwrapped
    private AppUser appUser;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "passenger_Ride_id",referencedColumnName = "passenger_ride_id")
    private Set<Ride> ride;
    @JsonIgnore
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private GeoLocation currentLocation;
    @OneToOne(cascade = {CascadeType.ALL})
    private GeoFencing geoFencing;

}
