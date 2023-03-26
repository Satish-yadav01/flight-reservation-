package com.satish.flightreservation.controller;

import com.satish.flightreservation.entity.Flight;
import com.satish.flightreservation.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @RequestMapping("findFlight")
    public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to,
                             @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-DD-YYYY")
                             Date departureDate, ModelMap modelMap){
        List<Flight> flight = flightRepository.findFlight(from, to, departureDate);
        modelMap.addAttribute("flight",flight);
        return "displayFlight";
    }
}
