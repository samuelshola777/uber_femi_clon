package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public enum Role {
    ADMINISTRATOR, DRIVER, PASSENGER;

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
