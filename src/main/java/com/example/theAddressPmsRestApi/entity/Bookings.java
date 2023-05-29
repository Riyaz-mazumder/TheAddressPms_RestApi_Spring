package com.example.theAddressPmsRestApi.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Bookings extends BaseModel{
    private String name;
    private String contactNumber;
    private String email;
    private String address;
    private String gender;


    private String paymentMethod;

    private String cash;

    private String bankName;
    private String bankBranchName;

    private String checkNumber;

    private Long propertyId;
    private String propertyName;
    private int propertyPrice;

    private Long userId;

}
