package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.tools.Tools;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String region = "us";
    private String city = "lagos-city";
    private String street = "oyinbgo";
    private String zip = "94043";
    private String latitude  ;
    private String longitude;

    public static double generateLatitude(){
        SecureRandom random = new SecureRandom();
        double lat = random.nextInt(100,120);
        return lat;
    }

    public double generateLongitude() {
        SecureRandom random = new SecureRandom();
        double lon = random.nextInt(120,130);
        return lon;
    }


    public  void setLontitudeLongitude(){
        SecureRandom random = new SecureRandom();
     double   latitude = generateLatitude();
     double  longitude = generateLongitude();

        char [] goeFar = { 'B','Y','S','A' };
        int i = random.nextInt(goeFar.length);
        char receive = goeFar[i];
        String take = String.valueOf(latitude);
        String take2 = String.valueOf(longitude);
        String coma = "-";
       this.latitude = receive+coma+take;
       this.longitude = receive+coma+take2;

    }

    public static void main(String[] args) {

       GeoLocation geoLocation = new GeoLocation();
        geoLocation.setLontitudeLongitude();

        System.out.println(geoLocation.getLatitude() + " " + geoLocation.getLongitude());
    }


}
