package com.codegym.projectmodule4backend.entity;

import javax.persistence.*;

@Entity
@Table( name = "Apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String houseKind;

    @Column
    private String roomKind;

    @Column
    private String address;

    @Column
    private String roomNumber;

    @Column
    private String bathNumber;

    @Column
    private String description;

    @Column
    private String prizePerNight;


    public Apartment() {
    }

    public Apartment(String name, String houseKind, String roomKind, String address, String roomNumber, String bathNumber, String description, String prizePerNight) {
        this.name = name;
        this.houseKind = houseKind;
        this.roomKind = roomKind;
        this.address = address;
        this.roomNumber = roomNumber;
        this.bathNumber = bathNumber;
        this.description = description;
        this.prizePerNight = prizePerNight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseKind() {
        return houseKind;
    }

    public void setHouseKind(String houseKind) {
        this.houseKind = houseKind;
    }

    public String getRoomKind() {
        return roomKind;
    }

    public void setRoomKind(String roomKind) {
        this.roomKind = roomKind;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBathNumber() {
        return bathNumber;
    }

    public void setBathNumber(String bathNumber) {
        this.bathNumber = bathNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrizePerNight() {
        return prizePerNight;
    }

    public void setPrizePerNight(String prizePerNight) {
        this.prizePerNight = prizePerNight;
    }
}
