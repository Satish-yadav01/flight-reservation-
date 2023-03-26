package com.satish.flightreservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{

    private Boolean checkedIn;
    private int numberOfBangs;
    @OneToOne
    private Passanger passanger;
    @OneToOne
    private Flight fLight;



    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getNumberOfBangs() {
        return numberOfBangs;
    }

    public void setNumberOfBangs(int numberOfBangs) {
        this.numberOfBangs = numberOfBangs;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public Flight getfLight() {
        return fLight;
    }

    public void setfLight(Flight fLight) {
        this.fLight = fLight;
    }
}
