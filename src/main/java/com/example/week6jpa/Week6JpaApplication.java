package com.example.week6jpa;

import com.example.week6jpa.model.Customer;
import com.example.week6jpa.model.CustomerStatus;
import com.example.week6jpa.model.Flight;
import com.example.week6jpa.model.FlightBooking;
import com.example.week6jpa.repository.CustomerRepository;
import com.example.week6jpa.repository.FlightBookingRepository;
import com.example.week6jpa.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week6JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week6JpaApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepository,
                          FlightRepository flightRepository,
                          FlightBookingRepository flightBookingRepository) {
        return args -> {
            Customer customer1 = customerRepository.save(new Customer("Alice", CustomerStatus.GOLD, 120000));
            Customer customer2 = customerRepository.save(new Customer("Bob", CustomerStatus.SILVER, 80000));
            Customer customer3 = customerRepository.save(new Customer("Charlie", CustomerStatus.NONE, 25000));

            Flight flight1 = flightRepository.save(new Flight("AB123", "Boeing 747", 300, 400));
            Flight flight2 = flightRepository.save(new Flight("CD456", "Airbus A320", 180, 250));
            Flight flight3 = flightRepository.save(new Flight("EF789", "Boeing 777", 350, 600));

            flightBookingRepository.save(new FlightBooking(customer1.getId(), flight1.getId()));
            flightBookingRepository.save(new FlightBooking(customer2.getId(), flight2.getId()));
            flightBookingRepository.save(new FlightBooking(customer3.getId(), flight3.getId()));
        };
    }
}
