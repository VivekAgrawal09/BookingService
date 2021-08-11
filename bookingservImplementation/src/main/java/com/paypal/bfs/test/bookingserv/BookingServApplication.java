package com.paypal.bfs.test.bookingserv;

import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BookingServApplication /*implements CommandLineRunner*/ {

    @Autowired
    private BookingService service;

    public static void main(String[] args) {
        SpringApplication.run(BookingServApplication.class, args);
    }

    /*@Override
    public void run(String... args) {

        Booking booking = new Booking();
        booking.setFirstName("Test..........................................");
        booking.setLastName("Test");

        Booking booking1 = service.saveOrUpdate(booking);

        List<Booking> allBookings = service.getAllBookings();
        System.out.println(allBookings.size() +  ".....................size.............. ");
        System.out.println(booking1.getFirstName());

    }*/
}