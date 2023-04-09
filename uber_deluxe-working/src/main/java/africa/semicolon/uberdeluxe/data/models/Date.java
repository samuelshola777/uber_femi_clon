package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.exception.DateException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Date {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int date;
    private int month;
    private int year;
    public void setDate(int date) throws DateException {
        if (date < 0 || date > 31) {
            throw new DateException("you have entered an invalid date ()--> "+date);
        }
        this.date = date;
    }
    public void month(int month) throws DateException {
        if (month < 0 || month > 31) {
            throw new DateException("you have entered an invalid month ()--> "+month);
        }
        this.month = month;
    }
}
