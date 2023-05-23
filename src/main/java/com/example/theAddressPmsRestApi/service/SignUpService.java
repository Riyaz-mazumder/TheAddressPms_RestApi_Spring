package com.example.theAddressPmsRestApi.service;

import com.example.theAddressPmsRestApi.dao.SignUpDao;

import com.example.theAddressPmsRestApi.entity.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpService {
    @Autowired
     private SignUpDao sd;

    public List<SignUp> getAllSignUps(){
        return sd.findAll();
    }

    public SignUp getSignUpsById(Long id){

        return sd.findById(id).orElse(new SignUp());
    }


    public void deleteSignUps(Long id){
        sd.deleteById(id);
    }

    public  void addSignUps(SignUp us){
        sd.save(us);
    }
}
