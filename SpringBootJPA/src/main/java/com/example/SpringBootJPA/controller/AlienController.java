package com.example.SpringBootJPA.controller;

import com.example.SpringBootJPA.dao.AlienRepo;
import com.example.SpringBootJPA.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController{

    @Autowired
    private AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        System.out.println(alien.getAName());

        repo.save(alien);

        return "home.jsp";
    }
}