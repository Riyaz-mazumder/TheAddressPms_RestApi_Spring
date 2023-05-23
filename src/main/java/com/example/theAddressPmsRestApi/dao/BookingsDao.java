package com.example.theAddressPmsRestApi.dao;

import com.example.theAddressPmsRestApi.entity.Bookings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingsDao extends JpaRepository<Bookings,Long> {

}
