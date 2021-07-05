package com.capstone.server.components;

import com.capstone.server.models.*;
import com.capstone.server.repositories.*;
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

//    @Autowired
//    InstantRepository instantRepository;
//
//    @Autowired
//    EnchantmentRespository enchantmentRespository;
//
//    @Autowired
//    CreatureRepository creatureRepository;
//
//    @Autowired
//    ArtefactRepository artefactRepository;
//
//    @Autowired
//    SorceryRepository sorceryRepository;
//
//    @Autowired
//    LandRepository landRepository;

    public DataLoader(){

    }
    
    @Override
    public void run(ApplicationArguments args) {
        Deck deck1 = new Deck("test deck");
        Deck deck2 = new Deck("test deck 2");
        Deck deck3 = new Deck("third deck");
        Deck deck4 = new Deck("deck 4");
        Deck deck5 = new Deck("another deck");
        Deck deck6 = new Deck("aaaand another deck");
        Deck deck7 = new Deck("testing...");
        Deck deck8 = new Deck("testing...1");
        Deck deck9 = new Deck("testing...2");
        Deck deck10 = new Deck("testing...3");
        Card swamp = new Card("Swamp", "colorless", 0, "{T}, add 1 black mana", 0, 0, "LAND", "1");
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        deck1.addCard(swamp);
        cardRepository.save(swamp);
        Card darkRitual = new Card("Dark Ritual", "Black", 1, "Add 3 Black Mana to your Mana Pool", 0, 0, "INSTANT", "2");
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        cardRepository.save(darkRitual);
        Card unholyStrength = new Card("Unholy Strength", "Black", 1, "Enchanted creature get +2/+1",0,0,"ENCHANTMENT", "3");
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        cardRepository.save(unholyStrength);
        Card blackKnight = new Card("Black Knight", "Black", 2, "First Strike, Protection from White",2,2,"CREATURE", "4");
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        cardRepository.save(blackKnight);
        Card ritualOfSoot = new Card("Ritual of Soot", "Black", 4,"Destroy each creature with converted mana cost 3 or less", 0, 0, "SORCERY", "5");
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        cardRepository.save(ritualOfSoot);
        Card ayara = new Card("Ayara, First of Lochtwain", "Black", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "6" );
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        cardRepository.save(ayara);
        Card lurrus = new Card("Lurrus of the Dream-Den", "Black/White", 3, "Companion — Each permanent card in your starting deck has mana value 2 or less. (If this card is your chosen companion, you may put it into your hand from outside the game for {3} any time you could cast a sorcery.)\n" +
                "Lifelink" + "During each of your turns, you may cast one permanent spell with mana value 2 or less from your graveyard.", 3, 2, "CREATURE", "7");
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        cardRepository.save(lurrus);
        Card cauldronFamiliar = new Card("Cauldron familiar", "Black", 1, "When Cauldron Familiar enters the battlefield, each opponent loses 1 life and you gain 1 life." +
                "Sacrifice a Food: Return Cauldron Familiar from your graveyard to the battlefield.",1,1, "CREATURE", "8");
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        cardRepository.save(cauldronFamiliar);
        Card bloodthirstyAerialist = new Card("Bloodthirsty Aerialist", "Black", 3, "Flying" +
                "Whenever you gain life, put a +1/+1 counter on Bloodthirsty Aerialist.", 2,3, "CREATURE", "9");
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        cardRepository.save(bloodthirstyAerialist);

        Card terror = new Card("Terror", "Black", 2, "Destroy target nonartifact, nonblack creature. It can't be regenerated.", 0, 0,"INSTANT", "10");
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        cardRepository.save(terror);
        Card witchsOven = new Card("Witch's Oven", "colorless", 1, "{T}, Sacrifice a creature: Create a Food token. If the sacrificed creature's toughness was 4 or greater, create two Food tokens instead. (They're artifacts with {2}, {T}, Sacrifice this artifact: You gain 3 life.)", 0, 0, "ARTEFACT", "11");
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        cardRepository.save(witchsOven);
        deckRepository.save(deck1);

        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(swamp);
        deck2.addCard(darkRitual);
        deck2.addCard(darkRitual);
        deck2.addCard(darkRitual);
        deck2.addCard(darkRitual);
        deck2.addCard(unholyStrength);
        deck2.addCard(unholyStrength);
        deck2.addCard(unholyStrength);
        deck2.addCard(unholyStrength);
        deck2.addCard(blackKnight);
        deck2.addCard(blackKnight);
        deck2.addCard(blackKnight);
        deck2.addCard(blackKnight);
        deck2.addCard(ritualOfSoot);
        deck2.addCard(ritualOfSoot);
        deck2.addCard(ritualOfSoot);
        deck2.addCard(ritualOfSoot);
        deck2.addCard(ayara);
        deck2.addCard(ayara);
        deck2.addCard(ayara);
        deck2.addCard(ayara);
        deck2.addCard(lurrus);
        deck2.addCard(lurrus);
        deck2.addCard(lurrus);
        deck2.addCard(lurrus);
        deck2.addCard(cauldronFamiliar);
        deck2.addCard(cauldronFamiliar);
        deck2.addCard(cauldronFamiliar);
        deck2.addCard(cauldronFamiliar);
        deck2.addCard(bloodthirstyAerialist);
        deck2.addCard(bloodthirstyAerialist);
        deck2.addCard(bloodthirstyAerialist);
        deck2.addCard(bloodthirstyAerialist);
        deck2.addCard(terror);
        deck2.addCard(terror);
        deck2.addCard(terror);
        deck2.addCard(terror);
        deck2.addCard(witchsOven);
        deck2.addCard(witchsOven);
        deck2.addCard(witchsOven);
        deck2.addCard(witchsOven);
        deckRepository.save(deck2);


        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deck3.addCard(swamp);
        deckRepository.save(deck3);

        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deck4.addCard(swamp);
        deckRepository.save(deck4);

        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deck5.addCard(swamp);
        deckRepository.save(deck5);

        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deck6.addCard(swamp);
        deckRepository.save(deck6);
        deckRepository.save(deck7);
        deckRepository.save(deck8);
        deckRepository.save(deck9);
        deckRepository.save(deck10);

    }
}
