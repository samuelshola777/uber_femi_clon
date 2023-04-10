package africa.semicolon.uberdeluxe.data.dto.response;

import africa.semicolon.uberdeluxe.data.models.RoleK;
import lombok.Data;

@Data
public class DriverResponse {
    private String fullName;
    private RoleK role;
    private int age;

    public  String toString(){

        return String.format("""
                
                Good day %s your role as a 
                
                """)

    }
}
