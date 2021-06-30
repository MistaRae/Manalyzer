package com.capstone.server.models;

import javax.persistence.Entity;

@Entity
public class Instant extends Card{

    public Instant(Deck deck, String name, String colour, int cost, String oracleText) {
        super(deck, name, colour, cost, oracleText);
    }

    public Instant() {
    }
}
