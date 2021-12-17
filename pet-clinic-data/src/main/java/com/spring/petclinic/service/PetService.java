package com.spring.petclinic.service;

import java.util.Set;

import com.spring.petclinic.entity.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();
}
