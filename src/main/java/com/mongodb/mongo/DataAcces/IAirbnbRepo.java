package com.mongodb.mongo.DataAcces;

import com.mongodb.mongo.Entites.AirbnbEntities;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface IAirbnbRepo extends MongoRepository<AirbnbEntities,String> {
    public List<AirbnbEntities> findByname(String name);
    public List<AirbnbEntities> findByspace(String name);


}
