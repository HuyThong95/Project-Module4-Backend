package com.codegym.projectmodule4backend.repository;

import com.codegym.projectmodule4backend.entity.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository<Apartment, Long> {
}
