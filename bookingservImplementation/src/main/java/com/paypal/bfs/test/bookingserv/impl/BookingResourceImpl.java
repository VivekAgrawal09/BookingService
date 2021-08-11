package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import com.paypal.bfs.test.bookingserv.utils.ResponseBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    BookingService bookingService;
    @Autowired
    private ResponseBuilderUtil responseUtil;

    @Override
    public ResponseEntity<Booking> create(@Validated Booking booking) {

        ResponseEntity<Booking> responseEntity = null;
        try {
            /*
            TO_DO
            Add validation for Date fields
             */
            Booking storedBooking = bookingService.saveOrUpdate(booking);
            responseEntity = responseUtil.buildResponse(storedBooking);
            //return responseEntity;
        } catch (Exception e) {
            responseEntity = responseUtil.buildErrorResponse(e);
        }
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Booking>> getBookings() {
        ResponseEntity<List<Booking>> responseEntity = null;
        try {
            List<Booking> storedBookings = bookingService.getAllBookings();
            responseEntity = responseUtil.buildResponseforList(storedBookings);
            //return responseEntity;
        } catch (Exception e) {
            responseEntity = responseUtil.buildErrorResponseforList(e);
        }
        return responseEntity;
    }
}
