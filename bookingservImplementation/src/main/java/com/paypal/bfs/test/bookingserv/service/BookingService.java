package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.exception.DuplicateBookingException;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList();
        bookingRepository.findAll().forEach(booking -> bookings.add(booking));
        return bookings;
    }

    public Booking saveOrUpdate(Booking booking) throws Exception{
        List<Booking> bookings = new ArrayList();
        bookingRepository.findAll().forEach(bking -> bookings.add(bking));
        for(int i=0; i<bookings.size();i++) {
            String fname = bookings.get(i).getFirstName();
            String lname = bookings.get(i).getLastName();
            String checkinDatetime = bookings.get(i).getCheckinDatetime();
            if(fname.equalsIgnoreCase(booking.getFirstName()) && lname.equalsIgnoreCase(booking.getLastName()) && checkinDatetime.equalsIgnoreCase(booking.getCheckinDatetime())) {
                throw new DuplicateBookingException();
            }
        }
        return bookingRepository.save(booking);
    }
}
