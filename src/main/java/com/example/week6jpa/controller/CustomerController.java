package com.example.week6jpa.controller;

import com.example.week6jpa.model.Customer;
import com.example.week6jpa.model.CustomerStatus;
import com.example.week6jpa.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/status/{status}")
    public List<Customer> getCustomersByStatus(@PathVariable CustomerStatus status) {
        return customerService.findByStatus(status);
    }

    @GetMapping("/high-mileage")
    public List<Customer> getHighMileageCustomers() {
        return customerService.findHighMileageCustomers();
    }
}
