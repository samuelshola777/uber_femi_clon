package africa.semicolon.uberdeluxe.googleMapProperties.Service;

import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.GeoLocation;
import africa.semicolon.uberdeluxe.data.models.Passenger;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class GeoFencingService {
    SecureRandom random = new SecureRandom();

    public GeoLocation goeFencingCalculator() {
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
    public boolean goeFencingCalculator( Passenger passenger) {
        String[] shomolu = {"pedro", "akoka", "bajulaiye", "arowojobe"};
        String[] yaba = {"Queenstreet", "commercial Avenue", "iwaya road", "tokunbo"};
        String[] ikeja = {"allen avenue", "opebi road", "toying", "awolowo way"};
        Map<String, String[]> localGoverment = new HashMap<>();
        localGoverment.put("shomomu", shomolu);
        localGoverment.put("yaba", yaba);
        localGoverment.put("ikeja", ikeja);


return false;
    }


  private  GeoLocation setLat$Long(){
        GeoLocation geoLocation = new GeoLocation();
      double [] location1 = { 100,300 };
      double [] location2 = { 400,600 };
      double [] location3 = { 700,900 };
      double[][] geoLocationArray = {location1,location2,location3};

      int geo = random.nextInt(3);
      System.out.println(geo+" <<--()-->>");
      geoLocation.setLatitude(String.valueOf(geoLocationArray[geo][0]));
System.out.println();
     geoLocation.setLongitude(String.valueOf(geoLocationArray[geo][1]));
      System.out.println(geo+" <<--()");

      return geoLocation;
  }

    public static void main(String[] args) {
GeoFencingService geoFence = new GeoFencingService();
        System.out.println("this is lat ()->> " +
    " "+geoFence.setLat$Long().getLatitude()+" \n" +
                " this is long  ()-->> "+geoFence. setLat$Long().getLongitude());
    }

}