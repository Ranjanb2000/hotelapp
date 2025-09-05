package com.hotel.custmer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustmerDto {

    private String name;
    private String email;
    private String password;
    private String city;
}
