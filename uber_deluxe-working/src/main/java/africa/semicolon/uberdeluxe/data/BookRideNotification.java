package africa.semicolon.uberdeluxe.data;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookRideNotification {
    private String currentLocation;
    private String name;
    private String destination;
    private LocalDateTime orderTime = LocalDateTime.now();
}
