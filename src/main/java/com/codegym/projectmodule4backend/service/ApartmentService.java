package com.codegym.projectmodule4backend.service;

import com.codegym.projectmodule4backend.entity.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    List<Apartment> getAllApartment();
    void saveApartment(Long id, Apartment apartment);
    void deleteApartment(Long id);
    Optional<Apartment> findApartmentById(Long id);
}
