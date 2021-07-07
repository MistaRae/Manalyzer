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
        Deck deck1 = new Deck("AYARA REBIRTH");
        Deck deck2 = new Deck("UGIN COMMANDER");
        Deck deck3 = new Deck("VIVIEN AGGRO");
        Deck deck4 = new Deck("TEZZERET ARTS");
        Deck deck5 = new Deck("BLUE CONTROL");
        Deck deck6 = new Deck("RED BURN");
        Card swamp = new Card("Swamp", "colorless", 0, "{T}, add 1 black mana", 0, 0, "LAND", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/a/b/ab950987-d88c-4326-98f4-1b1195788921.jpg?1624535761", "0.00");
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
        Card darkRitual = new Card("Dark Ritual", "Black", 1, "Add 3 Black Mana to your Mana Pool", 0, 0, "INSTANT", "","", "0.00");
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        cardRepository.save(darkRitual);
        Card unholyStrength = new Card("Unholy Strength", "Black", 1, "Enchanted creature get +2/+1",0,0,"ENCHANTMENT", "","", "0.00");
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        cardRepository.save(unholyStrength);
        Card blackKnight = new Card("Black Knight", "Black", 2, "First Strike, Protection from White",2,2,"CREATURE", "","", "0.00");
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        cardRepository.save(blackKnight);
        Card ritualOfSoot = new Card("Ritual of Soot", "Black", 4,"Destroy each creature with converted mana cost 3 or less", 0, 0, "SORCERY", "","","0.0");
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        cardRepository.save(ritualOfSoot);
        Card ayara = new Card("Ayara, First of Lochtwain", "Black", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/e/d/ed0ace28-9a33-4f0d-b8c8-f5517f20ccf1.jpg?1572490057", "16.49" );
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        cardRepository.save(ayara);
        Card lurrus = new Card("Lurrus of the Dream-Den", "Black/White", 3, "Companion — Each permanent card in your starting deck has mana value 2 or less. (If this card is your chosen companion, you may put it into your hand from outside the game for {3} any time you could cast a sorcery.)\n" +
                "Lifelink" + "During each of your turns, you may cast one permanent spell with mana value 2 or less from your graveyard.", 3, 2, "CREATURE", "","", "0.00");
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        cardRepository.save(lurrus);
        Card cauldronFamiliar = new Card("Cauldron familiar", "Black", 1, "When Cauldron Familiar enters the battlefield, each opponent loses 1 life and you gain 1 life." +
                "Sacrifice a Food: Return Cauldron Familiar from your graveyard to the battlefield.",1,1, "CREATURE", "","", "0.00");
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        cardRepository.save(cauldronFamiliar);
        Card bloodthirstyAerialist = new Card("Bloodthirsty Aerialist", "Black", 3, "Flying" +
                "Whenever you gain life, put a +1/+1 counter on Bloodthirsty Aerialist.", 2,3, "CREATURE", "","", "0.00");
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        cardRepository.save(bloodthirstyAerialist);
        Card terror = new Card("Terror", "Black", 2, "Destroy target nonartifact, nonblack creature. It can't be regenerated.", 0, 0,"INSTANT", "","", "0.00");
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        cardRepository.save(terror);
        Card witchsOven = new Card("Witch's Oven", "colorless", 1, "{T}, Sacrifice a creature: Create a Food token. If the sacrificed creature's toughness was 4 or greater, create two Food tokens instead. (They're artifacts with {2}, {T}, Sacrifice this artifact: You gain 3 life.)", 0, 0, "ARTEFACT", "","", "0.00");
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
        Card ugin = new Card("Ugin, the Spirit Dragon", "colorless", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/9/c/9c017fa9-7021-417a-9c2e-3df409644fcf.jpg?1594734662", "16.49" );
        cardRepository.save(ugin);
        deck2.addCard(ugin);
        deck2.addCard(ugin);
        deck2.addCard(ugin);
        deck2.addCard(ugin);
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
        Card vivien = new Card("Vivien, Monster's Advocate", "green", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/5/0/504ebb84-7e7b-4119-a128-a9c183c5d9de.jpg?1600970284", "16.49" );
        cardRepository.save(vivien);
        deck3.addCard(vivien);
        deck3.addCard(vivien);
        deck3.addCard(vivien);
        deck3.addCard(vivien);
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
        Card tezzeret = new Card("Tezzeret, Agent of Bolas", "blue/black", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/0/f/0f3c8470-1cc8-4383-8782-c022867d46e8.jpg?1562609629", "16.49" );
        cardRepository.save(tezzeret);
        deck4.addCard(tezzeret);
        deck4.addCard(tezzeret);
        deck4.addCard(tezzeret);
        deck4.addCard(tezzeret);
        deckRepository.save(deck4);
        Card jace = new Card("Jace, the Mind Sculptor", "blue", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/c/8/c8817585-0d32-4d56-9142-0d29512e86a9.jpg?1598304029", "16.49" );
        cardRepository.save(jace);
        deck5.addCard(jace);
        deck5.addCard(jace);
        deck5.addCard(jace);
        deck5.addCard(jace);
        deckRepository.save(deck5);
        Card chandra = new Card("Chandra, Heart of Fire", "red", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3, "CREATURE", "","https://c1.scryfall.com/file/scryfall-cards/border_crop/front/a/4/a4c3ca8c-c77c-43b8-84ad-796313ecc813.jpg?1594752360", "16.49" );
        cardRepository.save(chandra);
        deck6.addCard(chandra);
        deck6.addCard(chandra);
        deck6.addCard(chandra);
        deck6.addCard(chandra);
        deckRepository.save(deck6);


    }
}
