package com.jorisvanbreugel.testapp2.controller;

import com.jorisvanbreugel.testapp2.model.Kat;
import com.jorisvanbreugel.testapp2.model.Kitten;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KittenService {
    @Autowired
    KittenRepository kittenRepository;

    @Autowired
    KatRepository katRepository;

    public Kitten nieuweKitten(long id) {
        Kat k = katRepository.findById(id).get();
        Kitten kitten = new Kitten();
        kitten.naam = "Minoes";
        k.addKitten(kitten);
        //katRepository.save(k);
        return kittenRepository.save(kitten);
    }
}
