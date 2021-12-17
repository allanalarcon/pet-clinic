package com.spring.petclinic.service;

import java.util.Set;

import com.spring.petclinic.entity.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet findByLastName(String lastName);

	Vet save(Vet owner);

	Set<Vet> findAll();
}
