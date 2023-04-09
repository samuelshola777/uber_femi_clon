package africa.semicolon.uberdeluxe.service;

import africa.semicolon.uberdeluxe.data.dto.request.DriverRequest;
import africa.semicolon.uberdeluxe.data.dto.request.RegisterDriverRequest;
import africa.semicolon.uberdeluxe.data.models.Address;
import africa.semicolon.uberdeluxe.data.models.DateK;
import africa.semicolon.uberdeluxe.data.models.Gender;
import africa.semicolon.uberdeluxe.exception.DateException;
import lombok.RequiredArgsConstructor;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import static africa.semicolon.uberdeluxe.util.AppUtilities.UBER_DELUXE_TEST_IMAGE;
import static org.assertj.core.api.Assertions.assertThat;
@RequiredArgsConstructor
@SpringBootTest
class DriverServiceImplTest {

   private final DriverService driverService;
    private RegisterDriverRequest driverRequest;
    private DriverRequest driver1;
    private DriverRequest driver2;
    private DriverRequest driver3;
    private DriverRequest driver4;
    private DriverRequest driver5;
    private DriverRequest driver6;
    @BeforeEach
    void setUp() throws DateException {
      driver1 = new DriverRequest();
      driver1.setFullName("babaTunde badmos");
      driver1.setPhoneNumber("09099332737");
      Address address1 = new Address();
      address1.setCountry("nigeria");
      address1.setStreet("ojo street");
      address1.setState("lagos");
      address1.setHouseNumber("08");
  driver1.setAddress(address1);
 driver1.setGender(Gender.MALE);
 DateK date1 = new DateK();
 date1.setYear("1996");
 date1.setDate("14");
 date1.setMonth("6");

    }
//@Ignore
//    @Test
//    void register() throws IOException {
//        MockMultipartFile file =
//                new MockMultipartFile("test_license",
//                        new FileInputStream(UBER_DELUXE_TEST_IMAGE));
//     driverRequest.setLicenseImage(file);
//        var response = driverService.register(driverRequest);
//        assertThat(response).isNotNull();
//        assertThat(response.isSuccess()).isTrue();
//
//    }



}