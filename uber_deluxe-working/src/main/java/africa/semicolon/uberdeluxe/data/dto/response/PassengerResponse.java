package africa.semicolon.uberdeluxe.data.dto.response;

import africa.semicolon.uberdeluxe.data.models.GeoLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class PassengerResponse {
private String name;
private String phoneNumber;
@JsonIgnore
private GeoLocation currentLocation;
private String destination;

}
