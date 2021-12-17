package com.spring.petclinic.service;

import java.util.Set;

import com.spring.petclinic.entity.Owner;

public interface OwnerService {

	Owner findById(Long id);

	Owner findByLastName(String lastName);

	Owner save(Owner owner);

	Set<Owner> findAll();
}