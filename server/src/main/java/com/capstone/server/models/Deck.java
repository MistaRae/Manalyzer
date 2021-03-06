package com.capstone.server.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "Deck")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "deck")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "decks_cards",
            joinColumns = {@JoinColumn(name = "deck_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name ="card_id", nullable = false, updatable = false)}
    )
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

    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        Optional<Card> cardToRemove = this.cards.stream().filter((cardToCheck -> cardToCheck.getId().equals(card.getId()))).findFirst();
        cardToRemove.ifPresent(value -> this.cards.remove(value));
    }
}
