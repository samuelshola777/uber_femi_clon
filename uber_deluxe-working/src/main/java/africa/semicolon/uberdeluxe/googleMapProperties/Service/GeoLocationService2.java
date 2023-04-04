package africa.semicolon.uberdeluxe.googleMapProperties.Service;

import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.Passenger;
import africa.semicolon.uberdeluxe.googleMapProperties.model.LocationB;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Service
public class GeoLocationService2 {
    @Value("${gogle.map.api.key}")
    private String apiKey;
public LocationB getLocation(HttpServletRequest request) throws IOException {
    String ipAddress = request.getRemoteAddr();
    URL url = new URL("https://www.googleapis.com/geolocation/v1/geolocate?key=" + apiKey);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "application/json");
    String jsonPayload = "{\"considerIp\": \"true\", \"wifiAccessPoints\": []};";
    OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
    writer.write(jsonPayload);
    writer.flush();
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String response = reader.readLine();
    reader.close();

    ObjectMapper mapper = new ObjectMapper();;

    JsonNode node = mapper.readTree(response);
    JsonNode locationNode = node.get("location");

    double latitude = locationNode.get("lat").asDouble();
    double longitude = locationNode.get("lng").asDouble();
    LocationB location = new LocationB(latitude, longitude);
      return   location;
}
    public boolean goeFencingCalculator(Driver driver, Passenger passenger) {
        String[] shomolu = {"pedro", "akoka", "bajulaiye", "arowojobe"};
        String[] yaba = {"Queenstreet", "commercial Avenue", "iwaya road", "tokunbo"};
        String[] ikeja = {"allen avenue", "opebi road", "toying", "awolowo way"};
        Map<String, String[]> localGoverment = new HashMap<>();
        localGoverment.put("shomomu", shomolu);
        localGoverment.put("yaba", yaba);
        localGoverment.put("ikeja", ikeja);
        for (Map.Entry<String, String[]> entry : localGoverment.entrySet()) {
            String key = entry.getKey();
            for (int i = 0; i < entry.getValue().length; i++) {
            }
        }

        return false;
    }

}
