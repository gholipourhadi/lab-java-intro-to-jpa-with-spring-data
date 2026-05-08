package com.example.week6jpa.repository;

import com.example.week6jpa.model.Customer;
import com.example.week6jpa.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalMilesGreaterThan(Integer miles);
}
