package com.mongodb.mongo.restApi;


import com.mongodb.mongo.DataAcces.AirbnbDAL;
import com.mongodb.mongo.Entites.AirbnbEntities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AirbnbController {


    private AirbnbDAL airbnbDAL;


    public AirbnbController(AirbnbDAL airbnbDAL) {
        this.airbnbDAL = airbnbDAL;
    }


    @GetMapping("/get")
    public List<AirbnbEntities> getData(){
        return this.airbnbDAL.getAll();
    }
}
