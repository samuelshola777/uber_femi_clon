package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.data.dto.response.PassengerResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RideNotification {
@JsonIgnore
    @OneToOne
    private PassengerResponse passengerResponse;
    private LocalDateTime rideOrderingTime = LocalDateTime.now();
    private String currentLocation;
    private String destination;
    private String rideNotificationMessage;

}
