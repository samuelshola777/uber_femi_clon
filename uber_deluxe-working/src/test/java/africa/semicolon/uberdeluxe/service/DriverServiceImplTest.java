package africa.semicolon.uberdeluxe.service;

import africa.semicolon.uberdeluxe.data.dto.request.DriverRequest;
import africa.semicolon.uberdeluxe.data.dto.request.RegisterDriverRequest;
import africa.semicolon.uberdeluxe.data.models.Address;
import africa.semicolon.uberdeluxe.data.models.DateK;
import africa.semicolon.uberdeluxe.data.models.Gender;
import africa.semicolon.uberdeluxe.data.models.RoleK;
import africa.semicolon.uberdeluxe.exception.DateException;
import africa.semicolon.uberdeluxe.exception.DriverException;
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
 driver1.setRoles(RoleK.DRIVER);

 DateK date1 = new DateK();
 date1.setYear("1996");
 date1.setDate("14");
 date1.setMonth("6");
driver1.setPassword("password1");
 driver1.setBirthDateK(date1);

     driver2 = new DriverRequest();
 driver2.setFullName("yemi adegunwaya");

 Address address2 = new Address();
 address2.setState("lagos state");
 address2.setCountry("nigeria");
 address2.setHouseNumber("58");
 driver2.setAddress(address2);

 driver2.setPhoneNumber("09078452438");
 driver2.setGender(Gender.MALE);
 driver2.setRoles(RoleK.DRIVER);

 DateK date2 = new DateK();
 date2.setYear("1956");
 date2.setMonth("08");
 date2.setDate("12");

 driver2.setBirthDateK(date2);
 driver2.setPassword("smith");

 driver3 = new DriverRequest();
 driver3.setFullName("samuel agugi");
 driver3.setPhoneNumber("09096798879");
 driver3.setRoles(RoleK.DRIVER);

 Address address3 = new Address();
 address3.setHouseNumber("45");
 address3.setStreet("oyingbo");
 address3.setCountry("ghana");

 driver3.setAddress(address3);
 driver3.setGender(Gender.MALE);

 DateK date3 = new DateK();
 date3.setYear("2000");
 date3.setMonth("02");
 date3.setDate("05");
 driver3.setBirthDateK(date3);
 driver3.setPassword("cow");

 driver4 = new DriverRequest();
 driver4.setFullName("kemi shobowale");
 driver4.setPhoneNumber("08034243211");

 Address address4 = new Address();
 address4.setState("lokoja");
 address4.setHouseNumber("56");
 address4.setStreet("abahim");

 driver4.setAddress(address4);
 driver4.setGender(Gender.FEMALE);
 driver4.setRoles(RoleK.DRIVER);

   DateK date4 = new DateK();
   date4.setDate("31");
  date4.setMonth("07");
  date4.setYear("1999");
  driver4.setBirthDateK(date4);
  driver4.setPassword("goat");

driver5 = new DriverRequest();
 driver5.setFullName("ruka olaoye");
 driver5.setPhoneNumber("07041546776");
 driver5.setGender(Gender.FEMALE);

 Address address5 = new Address();
 address5.setStreet("akoka");
 address5.setState("akwaibom");
 address5.setHouseNumber("09");
 driver5.setAddress(address5);
 driver5.setRoles(RoleK.DRIVER);
 driver5.setPassword("guitar");

 DateK date5 = new DateK();
 date5.setDate("20");
 date5.setYear("2003");
 date5.setMonth("07");
 driver5.setBirthDateK(date5);


 driver6 = new DriverRequest();
 driver6.setFullName("bean goat");
 driver6.setPhoneNumber("08134237890");

  Address address6 = new Address();
  address6.setHouseNumber("21");
  address6.setStreet("oworo");
  address6.setState("ibadan");

  driver6.setAddress(address6);
  driver6.setGender(Gender.MALE);
  driver6.setRoles(RoleK.DRIVER);
  driver6.setPassword("oreOluwa");

  DateK date6 = new DateK();
  date6.setDate("07");
  date6.setYear("1997");
  date6.setMonth("09");
  driver6.setBirthDateK(date6);
    }

    @Test
 void testThatWeCanRegisterDriver() throws DriverException {

     driverService.registerAsDriver(driver1);
    }




}