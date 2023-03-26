package com.satish.flightreservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Passanger extends AbstractEntity {

    @Column(name = "FIRST_NAME")
    private String fname;

    @Column(name = "LAST_NAME")
    private String lname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
