package com.hotel.custmer.controller;

import com.hotel.custmer.dto.CustmerDto;
import com.hotel.custmer.service.IcustmerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/user")
public class CustmerController {

    @Autowired
    IcustmerService custmerService;


    @PostMapping("/addUser")
    public ResponseEntity<CustmerDto> addUser(@RequestBody CustmerDto custmerDto){
        CustmerDto savedUser =  custmerService.addCustmer(custmerDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUserById/{custId}")
    public ResponseEntity<CustmerDto> fetchUserDetailsById(@PathVariable Integer custId){
        CustmerDto custmerDto= custmerService.fetchCustmerDetailsById(custId);
        return new ResponseEntity<>(custmerDto, HttpStatus.OK);
    }
}
