package com.satish.flightreservation.entity;

import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Flight extends AbstractEntity{

    private String flightNo;
    private String operatingAirline;
    private String departureCity;
    private String arivalCity;
    private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;


    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArivalCity() {
        return arivalCity;
    }

    public void setArivalCity(String arivalCity) {
        this.arivalCity = arivalCity;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }
}
