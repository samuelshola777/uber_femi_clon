package africa.semicolon.uberdeluxe.googleMapProperties.Service;

import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.GeoLocation;
import africa.semicolon.uberdeluxe.data.models.Passenger;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
@Service
public class GeoLocationService {
    public  GeoLocation goeFencingCalculator() {
        SecureRandom random = new SecureRandom();
        GeoLocation geoLocation = new GeoLocation();
        String[] shomolu = {"pedro", "akoka", "bajulaiye", "arowojobe"};
        String[] yaba = {"Queenstreet", "commercial Avenue", "iwaya road", "tokunbo"};
        String[] ikeja = {"allen avenue", "opebi road", "toying", "awolowo way"};
        Map<String, String[]> localGoverment = new HashMap<>();
        localGoverment.put("shomomu", shomolu);
        localGoverment.put("yaba", yaba);
        localGoverment.put("ikeja", ikeja);
        int keyRandom = random.nextInt(localGoverment.size());
        String [] localGovermentKey = {"shomomu","yaba","ikeja"};
        String [] area = localGoverment.get(localGovermentKey[keyRandom]);
        int valueLength = random.nextInt(area.length);
            geoLocation.setCity(localGovermentKey[keyRandom]);
            geoLocation.setStreet(area[valueLength]);

        return geoLocation;
    }



}