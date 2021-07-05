package com.capstone.server;

import com.capstone.server.models.*;
import com.capstone.server.repositories.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

	@Autowired
	DeckRepository deckRepository;

	@Autowired
	InstantRepository instantRepository;

	@Autowired
	SorceryRepository sorceryRepository;

	@Autowired
	EnchantmentRespository enchantmentRespository;

	@Autowired
	CreatureRepository creatureRepository;

	@Autowired
	ArtefactRepository artefactRepository;

	@Autowired
	LandRepository landRepository;



	Deck deck1;
	Instant darkRitual;
	Sorcery serumVisions;
	Creature ragingGoblin;
	Enchantment dayOfTheDragons;
	Artefact krakensEye;
	Land island;


	@Before
	public void before(){
		deck1 = new Deck("test deck");
		deckRepository.save(deck1);
		darkRitual = new Instant("Dark Ritual", "black", 1, "TAP, add 3 Black Mana to your Mana Pool");
		instantRepository.save(darkRitual);
		ragingGoblin = new Creature("Raging Goblin", "red", 1, "Haste", 1, 1);
		creatureRepository.save(ragingGoblin);
		serumVisions = new Sorcery( "Serum Visions", "blue", 1, "Draw a card. Scry2");
		sorceryRepository.save(serumVisions);
		dayOfTheDragons = new Enchantment("Day of the Dragons", "Blue", 7, "When Day of the Dragons enters the battlefield, exile all creatures you control. " +
				"Then create that many 5/5 red Dragon creature tokens with flying. When Day of the Dragons leaves the battlefield, sacrifice all Dragons you control." +
				" Then return the exiled cards to the battlefield under your control.");
		enchantmentRespository.save(dayOfTheDragons);
		krakensEye = new Artefact("Krakens Eye", "colourless",2,"whenever a player plays a blue spell, you may gain 1 life");
		artefactRepository.save(krakensEye);
		island = new Land("island", "colorless", 0, "Tap, add one blue mana to your mana pool");
		landRepository.save(island);

	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddInstantToDeck(){
		deck1.addCard(darkRitual);
		assertEquals(1, deck1.cardCount());
	}

	@Test
	public void canAddCreatureToDeck(){
		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		assertEquals(2, deck1.cardCount());
	}

	@Test
	public void canAddSorceryToDeck(){
		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		deck1.addCard(serumVisions);
		assertEquals(3, deck1.cardCount());
	}

	@Test
	public void canAddEnchantmentToDeck(){
		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		deck1.addCard(serumVisions);
		deck1.addCard(dayOfTheDragons);
		assertEquals(4, deck1.cardCount());
	}

	@Test
	public void canAddArtefactToDeck(){

		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		deck1.addCard(serumVisions);
		deck1.addCard(dayOfTheDragons);
		deck1.addCard(krakensEye);
		assertEquals(5, deck1.cardCount());
	}
	@Test
	public void canAddLandToDeck(){
		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		deck1.addCard(serumVisions);
		deck1.addCard(dayOfTheDragons);
		deck1.addCard(krakensEye);
		deck1.addCard(island);
		assertEquals(6, deck1.cardCount());
	}

	@Test
	public void canRemoveCardsFromDeck(){
		deck1.addCard(darkRitual);
		deck1.addCard(ragingGoblin);
		deck1.addCard(serumVisions);
		deck1.addCard(dayOfTheDragons);
		deck1.addCard(krakensEye);
		deck1.addCard(island);
		deck1.removeCard(island);
		assertEquals(5, deck1.cardCount());
	}

}
