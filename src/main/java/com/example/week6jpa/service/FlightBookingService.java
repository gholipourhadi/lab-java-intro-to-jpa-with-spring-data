package com.example.week6jpa.service;

import com.example.week6jpa.model.FlightBooking;
import com.example.week6jpa.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public FlightBooking save(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }

    public List<FlightBooking> findAll() {
        return flightBookingRepository.findAll();
    }

    public List<FlightBooking> findByCustomerId(Integer customerId) {
        return flightBookingRepository.findByCustomerId(customerId);
    }

    public List<FlightBooking> findByFlightId(Integer flightId) {
        return flightBookingRepository.findByFlightId(flightId);
    }
}
