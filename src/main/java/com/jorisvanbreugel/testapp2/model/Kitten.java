package com.jorisvanbreugel.testapp2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Kitten {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    public String naam;


    @ManyToOne
    @JsonBackReference
    private Kat kat;

    public Kat setKat(Kat k) {
        this.kat = k;
        return k;
    }
}
