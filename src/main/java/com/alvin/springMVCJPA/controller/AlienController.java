package com.alvin.springMVCJPA.controller;

import com.alvin.springMVCJPA.model.Alien;
import com.alvin.springMVCJPA.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("/aliens")
    public List<Alien> getAliens(){
        return repo.findAll();
    }

    @GetMapping("/alien/{aid}")
    public Alien getAlien(@PathVariable("aid") int aid){
        return repo.findById(aid).orElse(new Alien(0,""));
    }

    @PostMapping("/alien")
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }
}
