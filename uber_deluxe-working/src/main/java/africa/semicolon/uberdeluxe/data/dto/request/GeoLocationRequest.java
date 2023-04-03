package africa.semicolon.uberdeluxe.data.dto.request;

import lombok.Data;

@Data
public class GeoLocationRequest {
    private String status = "success";
    private String continent = "africa";
    private String country = "nigeria";
    private String city = "lagos-city";
    private String street ;
    private String latitude  ;
    private String longitude;
}
