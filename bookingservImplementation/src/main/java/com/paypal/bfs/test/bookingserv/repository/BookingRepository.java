package com.paypal.bfs.test.bookingserv.repository;

import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
}
