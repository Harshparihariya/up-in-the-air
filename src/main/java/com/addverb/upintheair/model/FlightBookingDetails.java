package com.addverb.upintheair.model;

import com.addverb.upintheair.entity.FlightDetails;
import com.addverb.upintheair.entity.Passenger;

import java.time.LocalDate;
import java.util.List;


public class FlightBookingDetails {

    private int bookingId;
    private FlightDetails flightdetails;
    private List<Passenger> passengers;
    private LocalDate bookingDateTime;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public FlightDetails getFlightdetails() {
        return flightdetails;
    }

    public void setFlightdetails(FlightDetails flightdetails) {
        this.flightdetails = flightdetails;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public LocalDate getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(LocalDate bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }
}
