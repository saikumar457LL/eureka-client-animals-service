package org.ocean.eurekaclientanimalsservice.rest;

import org.ocean.eurekaclientanimalsservice.models.Animal;
import org.ocean.eurekaclientanimalsservice.repos.AnimalRepository;
import org.ocean.eurekaclientanimalsservice.service.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalApi {
    @Autowired
    AnimalDao animalDao;

    @GetMapping
    public ResponseEntity<List<Animal>> fetchAllAnimals() {
        return ResponseEntity.ok(animalDao.getAnimals());
    }

    @PostMapping
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        return ResponseEntity.ok(animalDao.addAnimal(animal));
    }
}
