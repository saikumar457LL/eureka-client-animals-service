package org.ocean.eurekaclientanimalsservice.repos;

import org.ocean.eurekaclientanimalsservice.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
