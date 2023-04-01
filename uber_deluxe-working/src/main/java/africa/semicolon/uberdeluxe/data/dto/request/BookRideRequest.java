package africa.semicolon.uberdeluxe.data.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookRideRequest {
    private Long passengerId;
    private LocationZ origin;
    private LocationZ destination;
}
