package com.jtm.twiservice.model;

public class Animal {

    private final long animalId;
    private final String animalName;
    private final int limbsNumber;
    private final String size;


    public Animal(long animalId, String animalName) {
        this.animalId = animalId;
        this.animalName = animalName;

        this.limbsNumber = getLimbsNumber(); //I don't know if I can skip it. Otherwise there are errors.
        this.size = getSize(); //I don't know if I can skip it. Otherwise there are errors.
    }

    public Animal(String animalName, int limbsNumber, String size) {
        this.animalName = animalName;
        this.limbsNumber = limbsNumber;
        this.size = size;

        this.animalId = getAnimalId(); //I don't know if I can skip it. Otherwise there are errors.
    }

    public long getAnimalId() {
        return animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getLimbsNumber() {
        return limbsNumber;
    }

    public String getSize() {
        return size;
    }
}
