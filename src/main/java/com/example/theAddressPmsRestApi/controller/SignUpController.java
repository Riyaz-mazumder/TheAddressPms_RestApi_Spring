package com.example.theAddressPmsRestApi.controller;

import com.example.theAddressPmsRestApi.entity.Bookings;
import com.example.theAddressPmsRestApi.entity.SignUp;
import com.example.theAddressPmsRestApi.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")


public class SignUpController {
    @Autowired
    SignUpService ss;

    @GetMapping("signUps")
    public List<SignUp> getAllSignUp(){
        return ss.getAllSignUps();
    }
    @PostMapping("signUps")
    public void saveData(@RequestBody SignUp signUp){
        ss.addSignUps(signUp);
    }


    @GetMapping("signUps/{id}")
    public SignUp getSignUpsById(@PathVariable Long id){
        return ss.getSignUpsById(id);
    }

    @PutMapping("signUps")
    public void UpdateSignUps (@RequestBody SignUp signUp){
        ss.addSignUps(signUp);
    }


    @DeleteMapping("signUps/{id}")
    public void deleteSignUps(@PathVariable Long id){
        ss.deleteSignUps(id);
    }
}
