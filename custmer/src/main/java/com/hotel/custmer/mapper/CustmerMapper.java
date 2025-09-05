package com.hotel.custmer.mapper;

import com.hotel.custmer.dto.CustmerDto;
import com.hotel.custmer.entity.Custmer;

public class CustmerMapper {
    public static Custmer mapToCustmer(CustmerDto custmerDto, Custmer custmer) {
        custmer.setName(custmerDto.getName());
        custmer.setEmail(custmerDto.getEmail());
        custmer.setPassword(custmerDto.getPassword());
        custmer.setCity(custmerDto.getCity());
        return custmer;
    }

    public static CustmerDto mapToCustmerDto(Custmer custmer, CustmerDto custmerDto) {
        custmerDto.setName(custmer.getName());
        custmerDto.setEmail(custmer.getEmail());
        custmerDto.setPassword(custmer.getPassword());
        custmerDto.setCity(custmer.getCity());
        return custmerDto;
    }
}
