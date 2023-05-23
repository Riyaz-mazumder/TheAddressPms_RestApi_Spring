package com.example.theAddressPmsRestApi.service;

import com.example.theAddressPmsRestApi.dao.BookingsDao;
import com.example.theAddressPmsRestApi.entity.Bookings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingsService {

    @Autowired
    private BookingsDao bd;


    public List <Bookings>getAllBookings(){
        return bd.findAll();
    }

    public Bookings getBookingsById(Long id){

        return bd.findById(id).orElse(new Bookings());
    }


    public void deleteBookings(Long id){
        bd.deleteById(id);
    }

    public  void addBookings(Bookings um){
        bd.save(um);
    }
}
