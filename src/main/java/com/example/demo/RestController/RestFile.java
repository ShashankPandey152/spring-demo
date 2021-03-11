package com.example.demo.RestController;

import com.example.demo.Data.PersonData;
import com.example.demo.Data.PersonDataDao;
import com.example.demo.MongoDB.AppConfig;
import com.example.demo.MongoDB.MongoDBDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class RestFile {

    @Autowired
    private PersonDataDao personDataDao;
    @Autowired
    AppConfig appConfig;

    @Autowired
    MongoDBDao mongoDBDao;

    @GetMapping("/name")
    public String getName(){
        return "Hello World!";
    }

    @GetMapping("/person")
    public List<PersonData> getID(){
        return personDataDao.getPersonData();

    }

    @GetMapping("/mongoData")
    public MongoDBDao getMongo(){
        mongoDBDao.setData(appConfig.getMongoOperations().getCollectionNames().toString());
        return mongoDBDao;

    }
}
