package com.capstone.server.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name = "Deck")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "card")
    @OneToMany(mappedBy = "card", fetch = FetchType.LAZY)
    private HashMap<Card, Integer> cards;

    @Column(name = "name")
    private String name;

    public Deck(String name) {
        this.name = name;
        this.cards = new HashMap<>();
    }

    public Deck() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<Card, Integer> getCards() {
        return cards;
    }

    public void setCards(HashMap<Card, Integer> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
