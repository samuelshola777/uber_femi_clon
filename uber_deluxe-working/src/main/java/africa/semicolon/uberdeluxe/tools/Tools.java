package africa.semicolon.uberdeluxe.tools;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Tools {

  static   SecureRandom random = new SecureRandom();

    public static double generateLatitude(){
        double lat = random.nextInt(100,120);
        return lat;
    }

    public double generateLongitude() {
        double lon = random.nextInt(120,130);
        return lon;
    }


    public  String setLontitudeLongitude(double latitude, double longitude){
        latitude = generateLatitude();
        longitude = generateLatitude();

        char [] goeFar = { 'B','Y','S','A' };
        int i = random.nextInt(goeFar.length);
        char receive = goeFar[i];
        String take = String.valueOf(latitude);
        String coma = "-";
      return receive+coma+take;

    }


Map<String,String> streets = new HashMap<>();



    String[] streebts = {"BARIGA", "YABA", "SABO", "ALAGOMEJI"};


}
