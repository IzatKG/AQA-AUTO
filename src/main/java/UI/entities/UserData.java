package UI.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
public class UserData {
    private String fullName;
    private  String email;
    private  String currentAddress;
    private  String permanentAddress;

}
