package com.funny.experience.controller;

import com.funny.experience.model.Creature;
import com.funny.experience.repository.CreatureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CreatureController {

    private final CreatureRepository repository;

    public CreatureController(CreatureRepository repository){
        this.repository = repository;
    }

    @GetMapping("/creatures")
    List<Creature> all(){return repository.findAll();}

}
