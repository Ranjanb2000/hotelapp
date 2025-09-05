package com.hotel.custmer.service.impl;

import com.hotel.custmer.dto.CustmerDto;
import com.hotel.custmer.entity.Custmer;
import com.hotel.custmer.mapper.CustmerMapper;
import com.hotel.custmer.repository.CustmerRepo;
import com.hotel.custmer.service.IcustmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustmerServiceImpl implements IcustmerService {

    @Autowired
    CustmerRepo custmerRepo;

    @Override
    public CustmerDto addCustmer(CustmerDto custmerDto) {
        Custmer cust= CustmerMapper.mapToCustmer(custmerDto, new Custmer());
        custmerRepo.save(cust);
        return CustmerMapper.mapToCustmerDto(cust, new CustmerDto());
    }

    @Override
    public CustmerDto fetchCustmerDetailsById(Integer custId) {
        return CustmerMapper.mapToCustmerDto(custmerRepo.findById(custId).get(),new CustmerDto());

    }
}
