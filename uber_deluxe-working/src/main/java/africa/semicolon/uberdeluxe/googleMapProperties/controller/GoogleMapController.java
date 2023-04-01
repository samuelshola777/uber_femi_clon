package africa.semicolon.uberdeluxe.googleMapProperties.controller;

import africa.semicolon.uberdeluxe.googleMapProperties.Service.GoogleMapService;
import com.google.maps.errors.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/location")
public class GoogleMapController {

    @Autowired
    private GoogleMapService googleMapService;

    @GetMapping("/{ipAddress}")
    public ResponseEntity<String> getLoaction(@PathVariable String ipAddress) {
        try {
            String location = googleMapService.getLocation(ipAddress);
            return ResponseEntity.ok(location);
        } catch (IOException | InterruptedException | ApiException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
