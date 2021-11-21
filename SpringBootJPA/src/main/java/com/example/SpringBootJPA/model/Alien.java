package com.example.SpringBootJPA.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Entity
public class Alien {

    @Id
    @Getter@Setter
    private int aId;

    @Getter@Setter
    private String aName;
}
