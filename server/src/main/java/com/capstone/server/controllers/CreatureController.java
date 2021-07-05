//package com.capstone.server.controllers;
//
//import com.capstone.server.models.Creature;
//import com.capstone.server.repositories.CreatureRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CreatureController {
//
//    @Autowired
//    CreatureRepository creatureRepository;
//
//    @GetMapping(value = "/creatures")
//    public ResponseEntity<List<Creature>> getAllCreatures(){
//        return new ResponseEntity<>(creatureRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/creatures/{id}")
//    public ResponseEntity getCard(@PathVariable Long id){
//        return new ResponseEntity<>(creatureRepository.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/creatures")
//    public ResponseEntity postCard(@RequestBody Creature creature){
//        creatureRepository.save(creature);
//        return new ResponseEntity(creature, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/creatures/{id}")
//    public ResponseEntity<Creature> deleteCard (@PathVariable Long id){
//        Creature found = creatureRepository.getById(id);
//        creatureRepository.delete(found);
//        return new ResponseEntity<>(null, HttpStatus.OK);
//    }
//
//}
