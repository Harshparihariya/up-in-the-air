package com.addverb.upintheair.controller;

import com.addverb.upintheair.dto.Status;
import com.addverb.upintheair.entity.BookingDetails;
import com.addverb.upintheair.model.FlightBookingDetails;
import com.addverb.upintheair.entity.FlightDetails;
import com.addverb.upintheair.entity.Passenger;
import com.addverb.upintheair.repository.BookingRepository;
import com.addverb.upintheair.repository.FlightRepository;
import com.addverb.upintheair.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightBookingController {

    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private  BookingRepository bookingRepository;
    @Autowired
    private PassengerRepository passengerRepository;

    //get all flight details
    @GetMapping("/get-all-flight-details")
    public List<FlightDetails> getAllFlightDetails() {
        return flightRepository.findAll();
    }

    //book a flight
    @PostMapping("/book-flight")
    public ResponseEntity<Status> bookFlight(@RequestBody FlightBookingDetails bookingDetails) {
        List<Passenger> passengers = bookingDetails.getPassengers();
        for (Passenger passenger : passengers) {
            passengerRepository.save(passenger);
        }
        BookingDetails booking = new BookingDetails();
        booking.setFlightNumber(bookingDetails.getFlightdetails().getFlightNumber());
        booking.setDepartureCity(bookingDetails.getFlightdetails().getDepartureCity());
        booking.setArrivalCity(bookingDetails.getFlightdetails().getArrivalCity());
        booking.setPassengerName(bookingDetails.getPassengers().get(0).getName());
        booking.setBookingDate(bookingDetails.getBookingDateTime());
        booking.setArrivalCity(bookingDetails.getFlightdetails().getArrivalCity());
        booking.setPassengerPhNo(bookingDetails.getPassengers().get(0).getPhoneNumber());
        booking.setTicketPrice(bookingDetails.getFlightdetails().getTicketPrice());
        booking.setPassengerId(passengers.get(0).getPassengerId());
        bookingRepository.save(booking);
        bookingDetails.setBookingId(booking.getBookingId());
        Status status = new Status();
        status.setStatus(true);
        status.setBookingId(bookingDetails.getBookingId());
        status.setStatusMessage("Booking Successful");
        return ResponseEntity.ok().body(status);
    }

    //view booking page
    @GetMapping("/booking-details")
    public ResponseEntity<BookingDetails> bookingDetails(@RequestParam ("id") int bookingId) {
        BookingDetails bookingDetails = bookingRepository.findById(bookingId).get();
        return ResponseEntity.ok().body(bookingDetails);
    }

}
