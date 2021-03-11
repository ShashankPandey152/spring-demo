package com.example.demo.MongoDB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class AppConfig {
//    public MongoClient mongoClient(){
//        return MongoClients.create("mongodb://localhost:27017");
//    }


    public MongoOperations getMongoOperations() {
        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoClientDbFactory(MongoClients.create("mongodb://localhost:27017"), "mongodbest"));
        return mongoOps;
    }
}
