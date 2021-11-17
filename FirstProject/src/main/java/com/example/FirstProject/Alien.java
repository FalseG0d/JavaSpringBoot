package com.example.FirstProject;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Alien {
    private int aId;
    private String aName;
    private String aTech;

    @Autowired
    private Laptop laptop;

    public void show(){
        System.out.println("In Show");
        laptop.compile();
    }
}
