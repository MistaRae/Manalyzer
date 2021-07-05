//package com.capstone.server.controllers;
//
//import com.capstone.server.models.Instant;
//import com.capstone.server.repositories.InstantRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class InstantController {
//
//    @Autowired
//    InstantRepository instantRepository;
//
//    @GetMapping(value = "/instants")
//    public ResponseEntity<List<Instant>> getAllInstants(){
//        return new ResponseEntity<>(instantRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/instants/{id}")
//    public ResponseEntity getInstant(@PathVariable Long id){
//        return new ResponseEntity<>(instantRepository.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/instants")
//    public ResponseEntity postInstant(@RequestBody Instant instant){
//        instantRepository.save(instant);
//        return new ResponseEntity(instant, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/instants/{id}")
//    public ResponseEntity<Instant> deleteInstant (@PathVariable Long id){
//        Instant found = instantRepository.getById(id);
//        instantRepository.delete(found);
//        return new ResponseEntity<>(null, HttpStatus.OK);
//    }
//
//}
