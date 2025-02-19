package UI.utils;

import UI.dto.UserData;

public class DataProvider {
    public static UserData getUser(){
        return UserData.builder()
                .fullName("IZat")
                .email("mn@gmail.com")
                .currentAddress("www street 15")
                .permanentAddress("kkk 14")
                .build();
    }
}
