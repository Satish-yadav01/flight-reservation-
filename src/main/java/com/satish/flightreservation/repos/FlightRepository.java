package com.satish.flightreservation.repos;

import com.satish.flightreservation.entity.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    @Query("from Flight where DepartureCity:departurecity and arrivalCity:arrivalCity and " +
            "dateOfDeparture:dateOfDeparture")
    List<Flight> findFlight(@Param("departurecity") String from,@Param("arrivalCity") String to,
                            @Param("dateOfDeparture") Date departureDate);
}
