package com.example.demo.Data;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
@Component
public class PersonDataDao {


    public static List<PersonData> personData = new LinkedList<>();

    static {
        personData.add(new PersonData(1,"a"));
    }

    public List<PersonData> getPersonData(){
        return personData;
    }
}
