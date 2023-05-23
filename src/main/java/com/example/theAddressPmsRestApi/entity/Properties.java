package com.example.theAddressPmsRestApi.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Properties extends BaseModel{
    private  String  name;
    private  String address;
    private  String area;
    private String  type;

    private  String description;
    private  Integer  price;
    private  String  category;
    private  String bedrooms;
    private  String bathrooms;
    private  String  size;
    private boolean approval;

    private String image1;
    private String image2;
    private String image3;




}
