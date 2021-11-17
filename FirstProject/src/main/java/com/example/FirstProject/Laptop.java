package com.example.FirstProject;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private int lId;
    private String lBrand;

    public void compile(){
        System.out.println("Compile");
    }
}
