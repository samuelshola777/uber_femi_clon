package africa.semicolon.uberdeluxe.rideService;
import africa.semicolon.uberdeluxe.data.dto.response.PassengerResponse;
import africa.semicolon.uberdeluxe.data.models.Passenger;
import africa.semicolon.uberdeluxe.data.models.RideNotification;

public class RideServices {


//    public RideNotification bookRide(Passenger passenger){
//    PassengerResponse mappedPassenger = maptoPassengerResponse(passenger);
//    }

    public PassengerResponse maptoPassengerResponse(Passenger passenger){
        PassengerResponse passengerR =  PassengerResponse.builder()
                .name(passenger.getAppUser().getName()).phoneNumber
                        (passenger.getPhoneNumber()).destination
                        (passenger.getDestination()).currentLocation
                        (passenger.getPickUpLocation()).build();
        return passengerR;
    }

}
