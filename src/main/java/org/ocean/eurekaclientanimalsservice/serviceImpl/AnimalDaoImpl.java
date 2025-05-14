package org.ocean.eurekaclientanimalsservice.serviceImpl;

import org.ocean.eurekaclientanimalsservice.models.Animal;
import org.ocean.eurekaclientanimalsservice.repos.AnimalRepository;
import org.ocean.eurekaclientanimalsservice.service.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalDaoImpl implements AnimalDao {

    @Autowired
    AnimalRepository animalRepository;

    @Override
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}
