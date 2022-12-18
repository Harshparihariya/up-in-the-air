package com.addverb.upintheair.repository;

import com.addverb.upintheair.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingDetails, Integer> {
}
