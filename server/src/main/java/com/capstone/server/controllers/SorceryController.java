package com.capstone.server.controllers;

import com.capstone.server.models.Card;
import com.capstone.server.models.Sorcery;
import com.capstone.server.repositories.SorceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class SorceryController {

    @Autowired
    SorceryRepository sorceryRepository;

    @GetMapping(value = "/sorceries")
    public ResponseEntity<List<Sorcery>> getAllSoreceries(){
        return new ResponseEntity<>(sorceryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/sorceries/{id}")
    public ResponseEntity getSorecery(@PathVariable Long id){
        return new ResponseEntity<>(sorceryRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/sorceries")
    public ResponseEntity postSorcery(@RequestBody Sorcery sorcery){
        sorceryRepository.save(sorcery);
        return new ResponseEntity(sorcery, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/sorceries/{id}")
    public ResponseEntity<Sorcery> deleteSorcery (@PathVariable Long id){
        Sorcery found = sorceryRepository.getById(id);
        sorceryRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
