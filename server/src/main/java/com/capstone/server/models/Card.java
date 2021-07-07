package com.capstone.server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "cards")
public class Card {

    @JsonIgnoreProperties(value = "cards")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "card_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "deck_id", nullable = false, updatable = false)}
    )
    private List<Deck> decks;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "colour")
    private String colour;

    @Column(name = "cost")
    private int cost;

    @Column(name = "oracle_text", length = 800)
    private String oracleText;

    @Column(name = "power")
    private int power;

    @Column(name = "toughness")
    private int toughness;

    @Column(name = "type", length = 800)
    private String type;

    @Column(name = "api_id")
    private String api_id;

    @Column(name = "image_URI")
    private String imageURI;

    @Column(name = "price")
    private String price;

    public Card(String name, String colour, int cost, String oracleText, int power, int toughness, String type, String api_id,String imageURI, String price ) {
        this.decks = new ArrayList<>();
        this.name = name;
        this.colour = colour;
        this.cost = cost;
        this.oracleText = oracleText;
        this.power = power;
        this.toughness = toughness;
        this.type = type;
        this.api_id = api_id;
        this.imageURI = imageURI;
        this.price = price;
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

    public List<Deck> getDecks() {
        return decks;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }

    public String getApi_id() {
        return api_id;
    }

    public void setApi_id(String api_id) {
        this.api_id = api_id;
    }
}
