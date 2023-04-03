package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
@Entity
public class GeoFencing {
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
    private String latitude = "800"  ;
    private String longitude = "100";

}
