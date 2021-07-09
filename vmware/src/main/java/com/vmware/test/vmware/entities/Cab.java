package com.vmware.test.vmware.entities;

public class Cab {
    Integer id;
    String driver;
    Cab registrationNumber;
    Location location;

    public Cab(int id, String driver, Cab registrationNumber) {
        this.id = id;
        this.driver = driver;
        this.registrationNumber = registrationNumber;
        this.location = new Location(0,0);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Cab getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Cab registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
