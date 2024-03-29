package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudServices<Pet, Long> {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
