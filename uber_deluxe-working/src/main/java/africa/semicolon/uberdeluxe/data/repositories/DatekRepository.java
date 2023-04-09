package africa.semicolon.uberdeluxe.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface DatekRepository extends JpaRepository<Long, Date> {
}
