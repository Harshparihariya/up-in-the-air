package com.addverb.upintheair;

import com.addverb.upintheair.entity.FlightDetails;
import com.addverb.upintheair.repository.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootTest
class UpInTheAirApplicationTests {

    @Autowired
	FlightRepository flightRepository;


	@Test
	void addCustomer() {
//		for (int i = 1; i < 30; i++) {
//			FlightDetails flightDetails = new FlightDetails();
//            flightDetails.setDepartureDateTime(LocalDateTime.of(LocalDate.of(2022,12,i), LocalTime.of(9,0,0)));
//			flightDetails.setFlightNumber("A32"+i);
//			flightDetails.setArrivalCity("Bangalore");
//			flightDetails.setDepartureCity("Delhi");
//			flightDetails.setArrivalDateTime(LocalDateTime.of(LocalDate.of(2022,12,i), LocalTime.of(12,0,0)));
//			flightDetails.setSeatsAvailable(20);
//			flightDetails.setSeatsBooked(40);
//			flightDetails.setTicketPrice("7000");
//			flightRepository.save(flightDetails);
//		}
	}

}

