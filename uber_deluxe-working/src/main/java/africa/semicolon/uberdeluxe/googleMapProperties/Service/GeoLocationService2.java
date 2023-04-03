package africa.semicolon.uberdeluxe.googleMapProperties.Service;

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

}
