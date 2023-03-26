package com.satish.flightreservation.entity;

import jakarta.persistence.*;

@Entity
public class User extends AbstractEntity{

    @Column(name = "FIRST_NAME")
    private String fname;

    @Column(name = "LAST_NAME")
    private String lname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
