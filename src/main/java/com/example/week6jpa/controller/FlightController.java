package com.example.week6jpa.controller;

import com.example.week6jpa.model.Flight;
import com.example.week6jpa.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.save(flight);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.findAll();
    }
}
