package UI.dto;

import lombok.*;

@Data
@Builder
public class UserData {
    private String fullName;
    private  String email;
    private  String currentAddress;
    private  String permanentAddress;
}
