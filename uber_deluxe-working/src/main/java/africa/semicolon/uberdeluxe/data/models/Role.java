package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
public enum Role {
    ADMINISTRATOR, DRIVER, PASSENGER;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    public void setId(Long id) {
        this.id = id;
    }

}
