package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.tools.Tools;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.tools.Tool;
import java.security.SecureRandom;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Data
public class GeoLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status = "success";
    private String continent = "africa";
    private String country = "nigeria";
    private String state="lagos";
    private String region = "us";
    private String city = "lagos-city";
    private String street ;
    private String zip = "94043";
    private String latitude  ;
    private String longitude;
    @OneToOne
    private GeoLocation tripEnverroment;






}
