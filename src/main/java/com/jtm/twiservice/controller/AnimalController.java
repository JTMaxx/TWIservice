package com.jtm.twiservice.controller;

import com.jtm.twiservice.model.Animal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AnimalController {
    private static final String template = "This is a(n) %s";
    private static final String mammalTemplate = "This is a(n) %s!  It has %s legs.";
    private final AtomicLong counter = new AtomicLong(1000);
    private final int limbsNumber = 4;
    private final String size = "small";

    @RequestMapping("/animal")
    public Animal animal(@RequestParam(value = "animalName", defaultValue = "Animalson") String animalName) {
        return new Animal(counter.incrementAndGet(), String.format(template, animalName));
    }
    // So, we have here object of Animal class, which is in this case a method, which returns an object of Animal type.
    // The method animal() has 1 param - animalName. todo: Does the method create content on website localhost:8080/animal ?


    @RequestMapping("/mammal")
    public Animal mammal(@RequestParam(value = "mammalName", defaultValue = "Mammalson") String mammalName,
                         @RequestParam(value = "limbsNumber", defaultValue = "4") int limbsNumber) {
        return new Animal(String.format(mammalTemplate, mammalName, limbsNumber), limbsNumber, size);
    }





}
