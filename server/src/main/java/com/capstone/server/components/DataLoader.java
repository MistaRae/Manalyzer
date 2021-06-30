package com.capstone.server.components;

import com.capstone.server.models.Card;
import com.capstone.server.models.Deck;
import com.capstone.server.models.Instant;
import com.capstone.server.repositories.CardRepository;
import com.capstone.server.repositories.DeckRepository;
import com.capstone.server.repositories.InstantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DeckRepository deckRepository;

    @Autowired
    CardRepository cardRepository;

    @Autowired
    InstantRepository instantRepository;

    public DataLoader(){

    }


    @Override
    public void run(ApplicationArguments args) {
        Deck deck1 = new Deck("test deck");
        deckRepository.save(deck1);

        Instant darkRitual = new Instant("Dark Ritual", "Black", 1, "TAP, add 3 Black Mana to your Mana Pool");
        instantRepository.save(darkRitual);


    }
}
