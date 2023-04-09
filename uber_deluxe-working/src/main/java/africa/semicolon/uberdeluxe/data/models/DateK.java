package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.exception.DateException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DateK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String month;
    private String year;
    public void setDate(String date) throws DateException {
        if (Integer.parseInt(date) < 0 ||Integer.parseInt( date) > 31) {
            throw new DateException("you have entered an invalid date ()--> "+date);
        }
        this.date = date;
    }
    public void month(String month) throws DateException {
        if (Integer.parseInt( month) < 0 || Integer.parseInt( month) > 31) {
            throw new DateException("you have entered an invalid month ()--> "+month);
        }
        this.month = month;
    }
}
