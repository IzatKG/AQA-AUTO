package UI.dto;

import lombok.*;

@Data
@Builder
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private String fullName;
    private  String email;
    private  String currentAddress;
    private  String permanentAddress;
}
