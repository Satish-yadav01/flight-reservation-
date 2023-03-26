package com.satish.flightreservation.repos;

import com.satish.flightreservation.entity.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassangerRepository extends JpaRepository<Passanger,Long> {
}
