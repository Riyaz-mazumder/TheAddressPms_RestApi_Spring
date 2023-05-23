package com.example.theAddressPmsRestApi.service;

import com.example.theAddressPmsRestApi.dao.PropertiesDao;
import com.example.theAddressPmsRestApi.entity.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertiesService {
    @Autowired
    private PropertiesDao pd;
    public List<Properties> getAllApprovedProperties_(){
        return pd.getApprovedProperties();
    }
    public List<Properties> getAllUnApprovedProperties_(){
        return pd.getUnApprovedProperties();
    }
    public Properties getPropertiesById(Long id){

        return pd.findById(id).orElse(new Properties());
    }

    public void deleteProperties(Long id){
        pd.deleteById(id);
    }

    public  void addProperties(Properties um){
        pd.save(um);
    }
    public List<Properties> getAllApprovedPropertiesBySearch_(String a , String b ,String c){
        return pd.getApprovedPropertiesBySearch(a,b,c);
    }
}
