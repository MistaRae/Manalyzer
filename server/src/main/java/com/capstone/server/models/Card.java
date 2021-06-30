package com.capstone.server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "cards")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "card_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name ="deck_id", nullable = false, updatable = false)}
    )
    private List<Deck> decks;

    @Column(name = "name")
    private String name;

    @Column(name = "colour")
    private String colour;

    @Column(name = "cost")
    private int cost;

    @Column(name = "oracle_text", length = 300)
    private String oracleText;

    public Card(String name, String colour, int cost, String oracleText) {
        this.decks = new ArrayList<>();
        this.name = name;
        this.colour = colour;
        this.cost = cost;
        this.oracleText = oracleText;
    }

    public Card() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Deck> getDeck() {
        return decks;
    }


    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }
}
