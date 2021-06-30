package com.capstone.server.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="sorceries")
public class Sorcery extends Card{

    public Sorcery(Deck deck, String name, String colour, int cost, String oracleText) {
        super(deck, name, colour, cost, oracleText);
    }

    public Sorcery() {
    }

}
