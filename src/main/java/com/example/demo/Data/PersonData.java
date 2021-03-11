package com.example.demo.Data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;
import java.util.LinkedList;
import java.util.List;


public class PersonData {


    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    public PersonData(int id,String name){
        this.id = id;
        this.name = name;
    }

}
