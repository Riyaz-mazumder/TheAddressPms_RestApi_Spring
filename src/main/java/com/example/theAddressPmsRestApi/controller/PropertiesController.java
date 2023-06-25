package com.example.theAddressPmsRestApi.controller;

import com.example.theAddressPmsRestApi.entity.Properties;
import com.example.theAddressPmsRestApi.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")

public class PropertiesController {

    @Autowired
    PropertiesService ps;

    @GetMapping("properties/approved")
    public List<Properties> getAllApprovedProperties(@RequestParam(value = "page", required = false ) Integer page){
     return ps.getAllApprovedProperties_(page);
  }


//    @GetMapping("properties/approved")
//    public List<Properties> getAllApprovedProperties(){
//        return ps.getAllApprovedProperties_();
//    }

    @GetMapping("properties/unApproved")
    public List<Properties> getAllUnApprovedProperties(){
        return ps.getAllUnApprovedProperties_();
    }

    @PostMapping("properties")
    public void saveData(@RequestBody Properties properties){
        ps.addProperties(properties);
    }

    @GetMapping("properties/{id}")
    public Properties getPropertiesById(@PathVariable Long id){
        return ps.getPropertiesById(id);
    }

    @PutMapping("properties")
    public void UpdateProperties (@RequestBody Properties properties){
        ps.addProperties(properties);
    }

    @DeleteMapping("properties/{id}")
    public void deleteProperties_ (@PathVariable Long id){
        ps.deleteProperties(id);
    }


    @GetMapping ("propertiesBySearch/{area}/{category}/{type}")
    public List<Properties> searchedProperties(@PathVariable String area,@PathVariable String category, @PathVariable String type){
        return ps.getAllApprovedPropertiesBySearch_(area,category,type);
    }


    @GetMapping ("propertiesBySearchByArea/{area}")
    public List<Properties> searchedProperties(@PathVariable String area){
        return ps.getAllApprovedPropertiesSearchByArea_(area);
    }

    @GetMapping ("userDetails/{id}")
    public List<Object[]> userDetailss(@PathVariable Long id){
        return ps.userDetails(id);
    }
}
