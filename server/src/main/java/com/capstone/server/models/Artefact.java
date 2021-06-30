package com.capstone.server.models;

import javax.persistence.Entity;

@Entity
public class Artefact  extends Card {

    public Artefact(Deck deck, String name, String colour, int cost, String oracleText) {
        super(deck, name, colour, cost, oracleText);
    }

    public Artefact() {
    }
}
