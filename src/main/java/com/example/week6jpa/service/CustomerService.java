package com.example.week6jpa.service;

import com.example.week6jpa.model.Customer;
import com.example.week6jpa.model.CustomerStatus;
import com.example.week6jpa.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public List<Customer> findByStatus(CustomerStatus status) {
        return customerRepository.findByStatus(status);
    }

    public List<Customer> findHighMileageCustomers() {
        return customerRepository.findByTotalMilesGreaterThan(100000);
    }
}
