package africa.semicolon.uberdeluxe.data.models;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import jakarta.persistence.*;
import lombok.*;

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
    @JsonUnwrapped
    private AppUser appUser;
    @OneToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST})
    private GeoLocation pickUpLocation;
    private String destination;
}
