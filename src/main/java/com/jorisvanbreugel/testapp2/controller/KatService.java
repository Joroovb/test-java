package com.jorisvanbreugel.testapp2.controller;

import com.jorisvanbreugel.testapp2.model.Kat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KatService {

    @Autowired
    KatRepository katRepository;

    public Iterable<Kat> haalAlleKatten() {
        return katRepository.findAll();
    }

    public Kat nieuweKat(Kat kat) {
        return katRepository.save(kat);
    }

    public Kat haalKatBijID(long id) {
        if (katRepository.existsById(id)) {
            return katRepository.findById(id).get();
        }
        return null;
    }

    public void verwijderKatBijID(long id) {
        katRepository.deleteById(id);
    }

    public Kat katJarig(long id) {
        Kat k = katRepository.findById(id).get();
        k.leeftijd += 1;
        return katRepository.save(k);
    }
}
