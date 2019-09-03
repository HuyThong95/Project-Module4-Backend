package com.codegym.projectmodule4backend.service.impl;

import com.codegym.projectmodule4backend.entity.Apartment;
import com.codegym.projectmodule4backend.repository.ApartmentRepository;
import com.codegym.projectmodule4backend.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public List<Apartment> getAllApartment(){
        return (List<Apartment>) apartmentRepository.findAll();
    }

    @Override
    public void saveApartment(Long id, Apartment apartment){
        apartmentRepository.save(apartment);
    }
    @Override
    public void deleteApartment(Long id){
        apartmentRepository.deleteById(id);
    }
    @Override
    public Optional<Apartment> findApartmentById(Long id){
        return apartmentRepository.findById(id);
    }
}
