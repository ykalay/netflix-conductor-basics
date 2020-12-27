package com.conductor.example.resource;

import javax.validation.constraints.NotBlank;

public class Animal {
    @NotBlank
    private String animalType;

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }
}
