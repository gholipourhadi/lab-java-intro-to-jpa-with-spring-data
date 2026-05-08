package com.example.week6jpa.controller;

import com.example.week6jpa.model.FlightBooking;
import com.example.week6jpa.service.FlightBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class FlightBookingController {

    private final FlightBookingService flightBookingService;

    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @PostMapping
    public FlightBooking createBooking(@RequestBody FlightBooking flightBooking) {
        return flightBookingService.save(flightBooking);
    }

    @GetMapping
    public List<FlightBooking> getAllBookings() {
        return flightBookingService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public List<FlightBooking> getBookingsByCustomerId(@PathVariable Integer customerId) {
        return flightBookingService.findByCustomerId(customerId);
    }

    @GetMapping("/flight/{flightId}")
    public List<FlightBooking> getBookingsByFlightId(@PathVariable Integer flightId) {
        return flightBookingService.findByFlightId(flightId);
    }
}
