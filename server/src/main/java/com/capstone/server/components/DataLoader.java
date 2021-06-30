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

    @Autowired
    InstantRepository instantRepository;

    @Autowired
    EnchantmentRespository enchantmentRespository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    ArtefactRepository artefactRepository;

    @Autowired
    SorceryRepository sorceryRepository;

    @Autowired
    LandRepository landRepository;

    public DataLoader(){

    }


    @Override
    public void run(ApplicationArguments args) {
        Deck deck1 = new Deck("test deck");
        Land swamp = new Land("Swamp", "colorless", 0, "{T}, add 1 black mana");
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
        landRepository.save(swamp);
        Instant darkRitual = new Instant("Dark Ritual", "Black", 1, "Add 3 Black Mana to your Mana Pool");
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        deck1.addCard(darkRitual);
        instantRepository.save(darkRitual);
        Enchantment unholyStrength = new Enchantment("Unholy Strength", "Black", 1, "Enchanted creature get +2/+1");
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        deck1.addCard(unholyStrength);
        enchantmentRespository.save(unholyStrength);
        Creature blackKnight = new Creature("Black Knight", "Black", 2, "First Strike, Protection from White",2,2);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        deck1.addCard(blackKnight);
        creatureRepository.save(blackKnight);
        Sorcery ritualOfSoot = new Sorcery("Ritual of Soot", "Black", 4,"Destroy each creature with converted mana cost 3 or less");
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        deck1.addCard(ritualOfSoot);
        sorceryRepository.save(ritualOfSoot);
        Creature ayara = new Creature("Ayara, First of Lochtwain", "Black", 3,"Whenever Ayara, First of Locthwain or another black creature enters the battlefield under your control, each opponent loses 1 life and you gain 1 life." +
                "{T}, Sacrifice another black creature: Draw a card.", 2,3 );
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        deck1.addCard(ayara);
        creatureRepository.save(ayara);
        Creature lurrus = new Creature("Lurrus of the Dream-Den", "Black/White", 3, "Companion — Each permanent card in your starting deck has mana value 2 or less. (If this card is your chosen companion, you may put it into your hand from outside the game for {3} any time you could cast a sorcery.)\n" +
                "Lifelink" + "During each of your turns, you may cast one permanent spell with mana value 2 or less from your graveyard.", 3, 2);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        deck1.addCard(lurrus);
        creatureRepository.save(lurrus);
        Creature cauldronFamiliar = new Creature("Cauldron familiar", "Black", 1, "When Cauldron Familiar enters the battlefield, each opponent loses 1 life and you gain 1 life." +
                "Sacrifice a Food: Return Cauldron Familiar from your graveyard to the battlefield.",1,1);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        deck1.addCard(cauldronFamiliar);
        creatureRepository.save(cauldronFamiliar);
        Creature bloodthirstyAerialist = new Creature("Bloodthirsty Aerialist", "Black", 3, "Flying" +
                "Whenever you gain life, put a +1/+1 counter on Bloodthirsty Aerialist.", 2,3);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        deck1.addCard(bloodthirstyAerialist);
        creatureRepository.save(bloodthirstyAerialist);

        Instant terror = new Instant("Terror", "Black", 2, "Destroy target nonartifact, nonblack creature. It can't be regenerated.");
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        deck1.addCard(terror);
        instantRepository.save(terror);
        Artefact witchsOven = new Artefact("Witch's Oven", "colorless", 1, "{T}, Sacrifice a creature: Create a Food token. If the sacrificed creature's toughness was 4 or greater, create two Food tokens instead. (They're artifacts with {2}, {T}, Sacrifice this artifact: You gain 3 life.)");
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        deck1.addCard(witchsOven);
        artefactRepository.save(witchsOven);
        deckRepository.save(deck1);

    }
}
