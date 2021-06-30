package com.capstone.server.models;

import javax.persistence.*;

@Entity
@Table(name = "lands")
public class Land extends Card{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Land(String name, String colour, int cost, String oracleText) {
        super(name, colour, cost, oracleText);
    }

    public Land() {
    }
}
