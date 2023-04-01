package africa.semicolon.uberdeluxe.googleMapProperties.Service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GoogleMapService {


    @Value("${google.maps.api.key}")
    private String apiKey;


    public String getLocation(String ipAddress) throws IOException, InterruptedException, ApiException {
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();

        GeocodingResult[] results = GeocodingApi.geocode(context, ipAddress).await();
   return results[0].formattedAddress;
    }




}
