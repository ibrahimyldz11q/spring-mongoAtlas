package com.mongodb.mongo.DataAcces;


import com.mongodb.mongo.Entites.AirbnbEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class AirbnbDAL  {


    @Autowired
    private  IAirbnbRepo iAirbnbRepo;


    public AirbnbDAL(IAirbnbRepo iAirbnbRepo) {
        this.iAirbnbRepo = iAirbnbRepo;
    }





    @Transactional
    public List<AirbnbEntities> getAll(){
        return this.iAirbnbRepo.findAll();
    }
}
