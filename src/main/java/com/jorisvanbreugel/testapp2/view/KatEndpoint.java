package com.jorisvanbreugel.testapp2.view;

import com.jorisvanbreugel.testapp2.controller.KatService;
import com.jorisvanbreugel.testapp2.model.Kat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/kat")
public class KatEndpoint {

    @Autowired
    KatService katService;

    @GetMapping("/all")
    public Iterable<Kat> haalAlleKatten() {
        ArrayList<Kat> katten = new ArrayList<>();
        Kat k = new Kat();
        k.naam = "Melinoe";
        k.leeftijd = 3;
        katten.add(k);
        return katten;
//        return katService.haalAlleKatten();
    }

    @GetMapping("/{id}")
    public Kat haalKatBijID(@PathVariable(value = "id") long id) {
        return katService.haalKatBijID(id);
    }

    @DeleteMapping("/{id}")
    public void verwijderKatBijID(@PathVariable(value = "id") long id) {
        katService.verwijderKatBijID(id);
    }

    @PostMapping("/nieuw")
    public Kat nieuweKat(@RequestBody Kat kat) {
        return katService.nieuweKat(kat);
    }

    @PutMapping("/{id}/verjaardag")
    public Kat katJarig(@PathVariable(value = "id") long id) {
        return katService.katJarig(id);
    }
}
