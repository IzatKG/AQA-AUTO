package UI.utils;

import UI.entities.UserData;

public class DataProvider {

    public static UserData getUser(){
        return UserData.builder()
                .fullName("izat")
                .email("mn@gmail.com")
                .currentAddress("www street 15")
                .permanentAddress("kkk 14")
                .build();
    }
}
