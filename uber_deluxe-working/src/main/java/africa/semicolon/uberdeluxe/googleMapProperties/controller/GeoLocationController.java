package africa.semicolon.uberdeluxe.googleMapProperties.controller;

import africa.semicolon.uberdeluxe.googleMapProperties.Service.GeoLocationService2;
import africa.semicolon.uberdeluxe.googleMapProperties.model.LocationB;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/currentLocation")
public class GeoLocationController {

    @Autowired
    GeoLocationService2 geoLocationService2;

    @GetMapping("/myLocation")
    public ResponseEntity<LocationB> getCurrentLocation(HttpServletRequest request) throws IOException {
        return new ResponseEntity<>(geoLocationService2.getLocation(request), HttpStatus.OK);
    }



}