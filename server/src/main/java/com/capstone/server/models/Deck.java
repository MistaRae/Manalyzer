package com.capstone.server.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Deck")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "deck")
    @OneToMany(mappedBy = "deck", fetch = FetchType.LAZY)
    private List<Card> cards;

    @Column(name = "name")
    private String name;

    public Deck(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public Deck() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void addCardToDeck(Card card) {
        this.cards.add(card);
    }
}
