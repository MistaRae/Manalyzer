package com.capstone.server.controllers;

import com.capstone.server.models.Card;
import com.capstone.server.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    CardRepository cardRepository;

    @GetMapping(value = "/cards")
    public ResponseEntity<List<Card>> getAllCards(){
        return new ResponseEntity<>(cardRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/cards/{id}")
    public ResponseEntity getCard(@PathVariable Long id){
        return new ResponseEntity<>(cardRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/cards")
    public ResponseEntity postCard(@RequestBody Card card){
        cardRepository.save(card);
        return new ResponseEntity(card, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/cards/{id}")
    public ResponseEntity<Card> deleteCard (@PathVariable Long id){
        Card found = cardRepository.getById(id);
        cardRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
