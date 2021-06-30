package com.capstone.server.controllers;

import com.capstone.server.models.Artefact;
import com.capstone.server.models.Card;
import com.capstone.server.models.Creature;
import com.capstone.server.models.Deck;
import com.capstone.server.repositories.ArtefactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Component
public class ArtefactController {

    @Autowired
    ArtefactRepository artefactRepository;

    @GetMapping(value = "/artefacts")
    public ResponseEntity<List<Artefact>> getAllArtefacts(){
        return new ResponseEntity<>(artefactRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/artefacts/{id}")
    public ResponseEntity getArtefact(@PathVariable Long id){
        return new ResponseEntity<>(artefactRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/artefacts")
    public ResponseEntity<Artefact> saveArtefact(@RequestBody Artefact artefact){
        artefactRepository.save(artefact);
        return new ResponseEntity<>(artefact, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/artefacts/{id}")
    public ResponseEntity<Artefact> deleteArtefact(@PathVariable Long id){
        Artefact found = (Artefact) artefactRepository.getById(id);
        artefactRepository.delete(found);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

}
