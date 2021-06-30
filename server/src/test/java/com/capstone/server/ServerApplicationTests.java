package com.capstone.server;

import com.capstone.server.models.Instant;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void canAddInstantsToDeck(){
		Instant darkRitual = new Instant(deck1,"Dark Ritual", "Black", 1, "TAP, add 3 Black Mana to your Mana Pool");
		instantRepository.save(darkRitual);
	}


}
