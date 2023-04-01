package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.data.dto.response.PassengerResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RideNotification {
@JsonIgnore
    private PassengerResponse passengerResponse;
    private LocalDateTime rideOrderingTime = LocalDateTime.now();

}
