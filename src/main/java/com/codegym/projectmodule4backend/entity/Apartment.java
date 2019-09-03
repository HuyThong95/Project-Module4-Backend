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
    private String housekind;

    @Column
    private String roomkind;

    @Column
    private String address;

    @Column
    private String roomnumber;

    @Column
    private String bathnumber;

    @Column
    private String description;

    @Column
    private String prizepernight;


    public Apartment() {
    }

    public Apartment(String name, String housekind, String roomkind, String address, String roomnumber, String bathnumber, String description, String prizepernight) {
        this.name = name;
        this.housekind = housekind;
        this.roomkind = roomkind;
        this.address = address;
        this.roomnumber = roomnumber;
        this.bathnumber = bathnumber;
        this.description = description;
        this.prizepernight = prizepernight;
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

    public String getHousekind() {
        return housekind;
    }

    public void setHousekind(String housekind) {
        this.housekind = housekind;
    }

    public String getRoomkind() {
        return roomkind;
    }

    public void setRoomkind(String roomkind) {
        this.roomkind = roomkind;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getBathnumber() {
        return bathnumber;
    }

    public void setBathnumber(String bathnumber) {
        this.bathnumber = bathnumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrizepernight() {
        return prizepernight;
    }

    public void setPrizepernight(String prizepernight) {
        this.prizepernight = prizepernight;
    }
}
