package com.capstone.server;

import com.capstone.server.models.Creature;
import com.capstone.server.models.Deck;
import com.capstone.server.models.Instant;
import com.capstone.server.models.Sorcery;
import com.capstone.server.repositories.DeckRepository;
import com.capstone.server.repositories.InstantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServerApplicationTests {

	@Autowired
	DeckRepository deckRepository;

	@Autowired
	InstantRepository instantRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddInstantToDeck(){
		Deck deck1 = new Deck("test deck");
		deckRepository.save(deck1);
		Instant darkRitual = new Instant("Dark Ritual", "Black", 1, "TAP, add 3 Black Mana to your Mana Pool");
		instantRepository.save(darkRitual);
		deck1.addCardToDeck(darkRitual);
		assertEquals(1, deck1.getCardCount());
	}

	@Test
	void canAddCreatureToDeck(){
		Deck deck1 = new Deck("test deck");
		deckRepository.save(deck1);
		Instant darkRitual = new Instant("Dark Ritual", "Black", 1, "TAP, add 3 Black Mana to your Mana Pool");
		instantRepository.save(darkRitual);
		Creature ragingGoblin = new Creature("Raging Goblin", "red", 1, "Haste", 1, 1);
		deck1.addCardToDeck(darkRitual);
		deck1.addCardToDeck(ragingGoblin);
		assertEquals(2, deck1.getCardCount());
	}

	@Test
	void canAddSorceryToDeck(){
		Deck deck1 = new Deck("test deck");
		deckRepository.save(deck1);
		Instant darkRitual = new Instant("Dark Ritual", "Black", 1, "TAP, add 3 Black Mana to your Mana Pool");
		instantRepository.save(darkRitual);
		Creature ragingGoblin = new Creature("Raging Goblin", "red", 1, "Haste", 1, 1);
		Sorcery serumVisions = new Sorcery( "Serum Visions", "Blue", 1, "Draw a card. Scry2");
		deck1.addCardToDeck(darkRitual);
		deck1.addCardToDeck(ragingGoblin);
		deck1.addCardToDeck(serumVisions);
		assertEquals(3, deck1.getCardCount());
	}


}
