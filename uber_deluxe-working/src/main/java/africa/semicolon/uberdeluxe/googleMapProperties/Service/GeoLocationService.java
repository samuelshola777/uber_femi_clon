package africa.semicolon.uberdeluxe.googleMapProperties.Service;

import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.GeoLocation;
import africa.semicolon.uberdeluxe.data.models.Passenger;

import java.util.HashMap;
import java.util.Map;

public class GeoLocationService {
  public GeoLocation6 goeFencingCalculator(){
        String [] shomolu = {"pedro","akoka", "bajulaiye","arowojobe"};
        String [] yaba = {"Queenstreet","commercial Avenue", "iwaya road","tokunbo"};
        String [] ikeja = {"allen avenue","opebi road", "toying","awolowo way"};
        Map<String, String[]> localGoverment = new HashMap<>();
        localGoverment.put("shomomu",shomolu);
        localGoverment.put("yaba",yaba);
        localGoverment.put("ikeja",ikeja);
        for(Map.Entry< String,String[]> entry : localGoverment.entrySet()){
            String key = entry.getKey();
            for (int i = 0; i < entry.getValue().length; i++) {

            }
        }
}
