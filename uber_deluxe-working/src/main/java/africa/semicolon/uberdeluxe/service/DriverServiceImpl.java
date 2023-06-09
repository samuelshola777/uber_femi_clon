package africa.semicolon.uberdeluxe.service;//package africa.semicolon.uberdeluxe.service;
//
//import africa.semicolon.uberdeluxe.cloud.CloudService;
//import africa.semicolon.uberdeluxe.data.dto.request.EmailNotificationRequest;
//import africa.semicolon.uberdeluxe.data.dto.request.Recipient;
//import africa.semicolon.uberdeluxe.data.dto.request.RegisterDriverRequest;
//import africa.semicolon.uberdeluxe.data.dto.response.RegisterResponse;
//import africa.semicolon.uberdeluxe.data.models.AppUser;
//import africa.semicolon.uberdeluxe.data.models.Driver;
//import africa.semicolon.uberdeluxe.data.models.Role;
//import africa.semicolon.uberdeluxe.data.repositories.DriverRepository;
//import africa.semicolon.uberdeluxe.exception.ImageUploadException;
//import africa.semicolon.uberdeluxe.notification.MailService;
//import africa.semicolon.uberdeluxe.util.AppUtilities;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.modelmapper.ModelMapper;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.HashSet;
//import java.util.Optional;
//

import africa.semicolon.uberdeluxe.data.dto.request.DriverRequest;
import africa.semicolon.uberdeluxe.data.dto.request.RegisterDriverRequest;
import africa.semicolon.uberdeluxe.data.dto.response.DriverResponse;
import africa.semicolon.uberdeluxe.data.models.DateK;
import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.RoleK;
import africa.semicolon.uberdeluxe.data.repositories.AddressRepository;
import africa.semicolon.uberdeluxe.data.repositories.DatekRepository;
import africa.semicolon.uberdeluxe.data.repositories.DriverRepository;
import africa.semicolon.uberdeluxe.exception.DriverException;
import africa.semicolon.uberdeluxe.service.DriverService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

//
//    private final DriverRepository driverRepository;
//    private final CloudService cloudService;
//    private final ModelMapper modelMapper;
//
//    private final MailService mailService;
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public RegisterResponse register(RegisterDriverRequest request) {
//        AppUser driverDetails = modelMapper.map(request, AppUser.class);
//        driverDetails.setPassword(passwordEncoder.encode(request.getPassword()));
//        driverDetails.setCreatedAt(LocalDateTime.now().toString());
//        driverDetails.setRoles(new HashSet<>());
//        driverDetails.getRoles().add(Role.DRIVER);
//        //steps
//        //1. upload drivers license image
//
//        var imageUrl = cloudService.upload(request.getLicenseImage());
//        if (imageUrl==null)
//            throw new ImageUploadException("Driver Registration failed");
//        //2. create driver object
//        Driver driver = Driver.builder()
//                .userDetails(driverDetails)
//                .licenseImage(imageUrl)
//                .build();
//        //3. save driver
//        Driver savedDriver = driverRepository.save(driver);
//        //4. send verification mail to driver
//        EmailNotificationRequest emailRequest = buildNotificationRequest(savedDriver.getUserDetails().getEmail(), savedDriver.getUserDetails().getName(), driver.getId());
//        String response = mailService.sendHtmlMail(emailRequest);
//        if (response==null) return getRegisterFailureResponse();
//        return RegisterResponse.builder()
//                .id(savedDriver.getId())
//                .isSuccess(true)
//                .message("Driver Registration Successful")
//                .build();
//    }
//
//    private static RegisterResponse getRegisterFailureResponse() {
//        return RegisterResponse.builder()
//                .id(-1L)
//                .isSuccess(false)
//                .message("Driver Registration Failed")
//                .build();
//    }
//
//    private EmailNotificationRequest buildNotificationRequest(String email, String name, Long userId) {
//        EmailNotificationRequest request = new EmailNotificationRequest();
//        request.getTo().add(new Recipient(name, email));
//        String template = AppUtilities.getMailTemplate();
//        String content = String.format(template, name, AppUtilities.generateVerificationLink(userId));
//        request.setHtmlContent(content);
//        return request;
//    }
//
//    @Override
//    public Optional<Driver> getDriverBy(Long driverId) {
//        return driverRepository.findById(driverId);
//    }
//
//    @Override
//    public void saveDriver(Driver driver) {
//        driverRepository.save(driver);
//    }
@Service
@AllArgsConstructor
@Slf4j
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final AddressRepository addressRepository;
    private final DatekRepository datekRepository;

    @Override
    public DriverResponse registerAsDriver(DriverRequest driverRequest) throws DriverException {
       Driver mappedDriver = mapResToDriver(driverRequest);
            if(checkIfAccountExist(mappedDriver)) throw new DriverException("Driver already exists");
            datekRepository.save(mappedDriver.getBirthDateK());
            addressRepository.save(mappedDriver.getAddress());
            driverRepository.save(mappedDriver);

    }


    private Driver mapResToDriver(DriverRequest driverRequest){
        Driver buildDriver = Driver.builder()
                .fullName(driverRequest.getFullName())
                .phoneNumber(driverRequest.getPhoneNumber())
                .password(driverRequest.getPassword())
                .address(driverRequest.getAddress())
                .roles(driverRequest.getRoles())
                .birthDateK(driverRequest.getBirthDateK())
                .build();
        return buildDriver;
    }
    private boolean checkIfAccountExist(Driver driver){
       Optional<Driver> foundDriver =  driverRepository.findbyPhoneNumber(driver.getPhoneNumber());
       Optional<Driver> nameFoundDriver = driverRepository.findbyFullName(driver.getFullName());
       if (foundDriver.isPresent() && nameFoundDriver.isPresent() && driver.getRoles() == RoleK.DRIVER) {
           return true;
       }
       return false;
    }
}
