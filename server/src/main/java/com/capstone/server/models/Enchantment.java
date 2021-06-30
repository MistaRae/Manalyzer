package com.capstone.server.models;

import javax.persistence.Entity;

@Entity
public class Enchantment extends Card{

    public Enchantment(Deck deck, String name, String colour, int cost, String oracleText) {
        super(deck, name, colour, cost, oracleText);
    }

    public Enchantment() {
    }
}
