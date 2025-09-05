package com.hotel.custmer.service;

import com.hotel.custmer.dto.CustmerDto;
import org.springframework.http.ResponseEntity;

public interface IcustmerService {

    CustmerDto addCustmer(CustmerDto custmerDto);

    CustmerDto fetchCustmerDetailsById(Integer userId);
}
