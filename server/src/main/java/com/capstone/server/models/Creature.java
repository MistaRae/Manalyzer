package com.capstone.server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "creatures")
public class Creature extends Card {


    @Column(name = "power")
    private int power;

    @Column(name = "toughness")
    private int toughness;

    public Creature( String name, String colour,int cost, String oracleText, int power, int toughness) {
        super(name, colour, cost, oracleText);
        this.power = power;
        this.toughness = toughness;
    }

    public Creature() {
        super();
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
}
