package com.jorisvanbreugel.testapp2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String naam;
    public String kleur;
    public int leeftijd;
    public String soort;

    @Enumerated(EnumType.STRING)
    public Geslacht geslacht;

    @OneToMany
    @JsonManagedReference
    public List<Kitten> kittens = new ArrayList<>();

    public List<Kitten> addKitten (Kitten k) {
        this.kittens.add(k);
        k.setKat(this);
        return this.kittens;
    }
}
