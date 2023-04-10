package africa.semicolon.uberdeluxe.data.repositories;

import africa.semicolon.uberdeluxe.data.models.DateK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface DatekRepository extends JpaRepository<DateK,Long> {
}
