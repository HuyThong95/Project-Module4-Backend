package com.codegym.projectmodule4backend.controller;

import com.codegym.projectmodule4backend.entity.Apartment;
import com.codegym.projectmodule4backend.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class ApartmentController {
    @Autowired
    public ApartmentService apartmentService;

    @RequestMapping(value = "/apartments")
    public ResponseEntity<List<Apartment>> getApartment(){
        return new ResponseEntity<>(apartmentService.getAllApartment(), HttpStatus.OK);
    }

    @RequestMapping(value = "/create-apartment", method = RequestMethod.POST)
    public ResponseEntity<String> createApartment( @RequestBody Apartment apartment){
        apartmentService.saveApartment(apartment.getId(), apartment);
        return new ResponseEntity<>("Apartment created", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update-apartment/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateApartment(@PathVariable("id") Long id, @RequestBody Apartment apartment){
        apartmentService.deleteApartment(id);
        apartment.setId(id);
        apartmentService.saveApartment(id, apartment);
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }

    @RequestMapping(value = "/delete-apartment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteApartment(@PathVariable("id") Long id){
        apartmentService.deleteApartment(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }



}
