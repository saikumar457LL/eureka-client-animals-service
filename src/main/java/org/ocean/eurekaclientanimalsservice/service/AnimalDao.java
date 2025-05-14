package org.ocean.eurekaclientanimalsservice.service;

import org.ocean.eurekaclientanimalsservice.models.Animal;

import java.util.List;

public interface AnimalDao {

    List<Animal> getAnimals();
    Animal addAnimal(Animal animal);
}
