//package com.capstone.server.controllers;
//
//import com.capstone.server.models.Instant;
//import com.capstone.server.models.Land;
//import com.capstone.server.repositories.LandRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class LandController {
//
//    @Autowired
//    LandRepository landRepository;
//
//    @GetMapping(value = "/lands")
//    public ResponseEntity<List<Land>> getAllLands(){
//        return new ResponseEntity<>(landRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/lands/{id}")
//    public ResponseEntity getLand(@PathVariable Long id){
//        return new ResponseEntity<>(landRepository.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/lands")
//    public ResponseEntity postLand(@RequestBody Land land){
//        landRepository.save(land);
//        return new ResponseEntity(land, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping(value = "/lands/{id}")
//    public ResponseEntity<Instant> deleteLand (@PathVariable Long id){
//        Land found = landRepository.getById(id);
//        landRepository.delete(found);
//        return new ResponseEntity<>(null, HttpStatus.OK);
//    }
//}
