package africa.semicolon.uberdeluxe.service;

import africa.semicolon.uberdeluxe.data.dto.request.RegisterDriverRequest;
import lombok.RequiredArgsConstructor;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

import static africa.semicolon.uberdeluxe.util.AppUtilities.UBER_DELUXE_TEST_IMAGE;
import static org.assertj.core.api.Assertions.assertThat;
@RequiredArgsConstructor
@SpringBootTest
class DriverServiceImplTest {

   private final DriverService driverService;
    private RegisterDriverRequest driverRequest;
    @BeforeEach
    void setUp() {
        driverRequest =new RegisterDriverRequest();
        driverRequest.setPassword("test_password");
        driverRequest.setName("test driver");
        driverRequest.setEmail("test@email.com");
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