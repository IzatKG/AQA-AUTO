package UI.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class UserData {
    private String fullName;
    private  String email;
    private  String currentAddress;
    private  String permanentAddress;

}
