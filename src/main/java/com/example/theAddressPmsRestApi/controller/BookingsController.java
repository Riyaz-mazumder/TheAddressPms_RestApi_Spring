package com.example.theAddressPmsRestApi.controller;

import com.example.theAddressPmsRestApi.entity.Bookings;

import com.example.theAddressPmsRestApi.service.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins="http://localhost:4200/",allowCredentials = "true")


public class BookingsController {
    @Autowired
    private BookingsService bs;


    @GetMapping("bookings")
    public List<Bookings> getAllBookings(){
        return bs.getAllBookings();
    }

    @PostMapping("bookings")
    public void saveData(@RequestBody Bookings bookings){
        bs.addBookings(bookings);
    }

    @GetMapping("bookings/{id}")
    public Bookings getBookingsById(@PathVariable Long id){
        return bs.getBookingsById(id);
    }

    @PutMapping("bookings")
    public void UpdateBookings (@RequestBody Bookings bookings){
        bs.addBookings(bookings);
    }

    @DeleteMapping("bookings/{id}")
    public void deleteBookings (@PathVariable Long id){
        bs.deleteBookings(id);
    }

}
