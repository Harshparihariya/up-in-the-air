package com.addverb.upintheair.repository;

import com.addverb.upintheair.entity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightRepository extends JpaRepository<FlightDetails,Integer> {

}
