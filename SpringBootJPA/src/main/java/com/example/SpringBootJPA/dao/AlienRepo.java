package com.example.SpringBootJPA.dao;

import com.example.SpringBootJPA.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {


}
