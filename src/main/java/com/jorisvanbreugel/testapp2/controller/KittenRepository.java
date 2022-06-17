package com.jorisvanbreugel.testapp2.controller;

import com.jorisvanbreugel.testapp2.model.Kitten;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface KittenRepository extends CrudRepository<Kitten, Long> {
}
