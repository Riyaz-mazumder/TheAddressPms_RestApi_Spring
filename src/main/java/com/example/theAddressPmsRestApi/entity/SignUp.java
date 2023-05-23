package com.example.theAddressPmsRestApi.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
@Data
@Entity
public class SignUp extends BaseModel {
    private String name;
    private String email;
    private String gender;
    private LocalDate dob;
    private String password;

}
