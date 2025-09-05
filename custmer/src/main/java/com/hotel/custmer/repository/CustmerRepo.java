package com.hotel.custmer.repository;

import com.hotel.custmer.entity.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustmerRepo extends JpaRepository<Custmer,Integer> {
}
