package com.example.week6jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer totalMiles;

    public Customer() {
    }

    public Customer(String name, CustomerStatus status, Integer totalMiles) {
        this.name = name;
        this.status = status;
        this.totalMiles = totalMiles;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public Integer getTotalMiles() {
        return totalMiles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public void setTotalMiles(Integer totalMiles) {
        this.totalMiles = totalMiles;
    }
}
