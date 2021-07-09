package com.vmware.test.vmware.entities;

import java.util.Date;

public class Booking {
    Customer customer;
    Cab cab;
    Date bookingTime;

    public Booking(Customer customer, Cab cab, Date bookingTime) {
        this.customer = customer;
        this.cab = cab;
        this.bookingTime = bookingTime;
    }

    public Customer getCustormer() {
        return customer;
    }

    public void setCustormer(Customer customer) {
        this.customer = customer;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }
}
