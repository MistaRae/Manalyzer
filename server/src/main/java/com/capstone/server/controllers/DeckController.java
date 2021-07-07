package com.capstone.server.controllers;

import com.capstone.server.models.Card;
import com.capstone.server.models.Deck;
import com.capstone.server.repositories.CardRepository;
import com.capstone.server.repositories.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeckController {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    DeckRepository deckRepository;

    @GetMapping(value = "/decks")
    public ResponseEntity<List<Deck>> getAllDecks(){
        return new ResponseEntity<>(deckRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/decks/{id}")
    public ResponseEntity getDeck(@PathVariable Long id){
        return new ResponseEntity<>(deckRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/decks")
    public ResponseEntity<Deck> saveDeck(@RequestBody Deck deck){
        deckRepository.save(deck);
        return new ResponseEntity<>(deck, HttpStatus.OK);
    }

    @PostMapping(value = "/decks/{id}/add-card")
    public ResponseEntity<Deck> addCardToDeck(@RequestBody Card card, @PathVariable Long id){
        Deck deck = deckRepository.findById(id).get();
        cardRepository.save(card);
        deck.addCard(card);
        deckRepository.save(deck);
        return new ResponseEntity<>(deck, HttpStatus.OK);
    }

    @DeleteMapping(value = "/decks/{id}")
    public ResponseEntity<Deck> deleteDeck(@PathVariable Long id){
        Deck found = deckRepository.getById(id);
        deckRepository.delete(found);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @DeleteMapping(value = "/decks/{id}/delete-card")
    public ResponseEntity<Deck> deleteCardFromDeck(@RequestBody Card card, @PathVariable Long id){
        Deck deck = deckRepository.findById(id).get();
        deck.removeCard(card);
        deckRepository.save(deck);
        return new ResponseEntity<>(deck, HttpStatus.OK);
    }



}
