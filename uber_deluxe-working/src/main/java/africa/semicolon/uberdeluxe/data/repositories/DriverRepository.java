package africa.semicolon.uberdeluxe.data.repositories;

import africa.semicolon.uberdeluxe.data.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
 Optional<   Driver> findbyPhoneNumber(String phoneNumber);

    Optional<Driver> findbyFullName(String fullName);
}
