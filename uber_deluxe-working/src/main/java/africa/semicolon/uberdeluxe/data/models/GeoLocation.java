package africa.semicolon.uberdeluxe.data.models;

import africa.semicolon.uberdeluxe.tools.Tools;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.tools.Tool;
import java.security.SecureRandom;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Data
public class GeoLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private GeoLocation tripEnviroment;






}
