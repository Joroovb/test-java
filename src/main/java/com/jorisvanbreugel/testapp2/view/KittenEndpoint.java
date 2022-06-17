package com.jorisvanbreugel.testapp2.view;

import com.jorisvanbreugel.testapp2.controller.KittenService;
import com.jorisvanbreugel.testapp2.model.Kitten;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittenEndpoint {

    @Autowired
    KittenService kittenService;

    @GetMapping("{kat_id}/new")
    public Kitten nieuweKitten(@PathVariable(value = "kat_id") long id) {
       return kittenService.nieuweKitten(id);
    }
}
