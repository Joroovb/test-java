package com.jorisvanbreugel.testapp2.controller;

import com.jorisvanbreugel.testapp2.model.Kat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface KatRepository extends CrudRepository<Kat, Long> {
}
