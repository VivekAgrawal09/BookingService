package com.paypal.test.bfs.bookingserv;

import com.paypal.bfs.test.bookingserv.api.entity.Address;
import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.exception.DuplicateBookingException;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    @InjectMocks
    private BookingService service;

    @Mock
    private BookingRepository bookingRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSave() throws Exception{

        Booking booking = new Booking();
        booking.setFirstName("Test");
        booking.setLastName("Test");
        booking.setCheckinDatetime("hjk");
        booking.setCheckoutDatetime("hjkl");
        booking.setDeposit(5678);
        booking.setTotalprice(9009);
        Address address = new Address();
        address.setLine1("hjk");
        address.setCity("hjkq");
        address.setState("oiu");
        address.setZipCode("567890");
        booking.setAddress(address);
        Mockito.when(bookingRepository.save(ArgumentMatchers.any()))
                .thenReturn(booking);
        Booking booking1 = service.saveOrUpdate(booking);

        assertEquals("Test", booking1.getFirstName());


    }

    @Test(expected = DuplicateBookingException.class)
    public void testSave2() throws Exception{

        Booking booking = new Booking();
        booking.setFirstName("Test");
        booking.setLastName("Test");
        booking.setCheckinDatetime("hjk");
        booking.setCheckoutDatetime("hjkl");
        booking.setDeposit(5678);
        booking.setTotalprice(9009);
        Address address = new Address();
        address.setLine1("hjk");
        address.setCity("hjkq");
        address.setState("oiu");
        address.setZipCode("567890");
        booking.setAddress(address);
        Mockito.when(bookingRepository.save(ArgumentMatchers.any()))
                .thenReturn(booking);
        List<Booking> bookings = new ArrayList();
        bookings.add(booking);
        Iterable<Booking> iterator = bookings;
        Mockito.when(bookingRepository.findAll())
                .thenReturn(iterator);
        Booking booking1 = service.saveOrUpdate(booking);
        Booking booking2 = service.saveOrUpdate(booking);

        //assertEquals("Test", booking1.getFirstName());


    }

    @Test
    public void testFindAll() {

        Booking booking = new Booking();
        booking.setFirstName("Test");
        booking.setLastName("Test");
        booking.setCheckinDatetime("hjkqw");
        booking.setCheckoutDatetime("hjkl");
        booking.setDeposit(5678);
        booking.setTotalprice(9009);
        Address address = new Address();
        address.setLine1("hjk");
        address.setCity("hjkq");
        address.setState("oiu");
        address.setZipCode("567890");
        booking.setAddress(address);
        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking);
        Iterable<Booking> iterator = bookings;
        Mockito.when(bookingRepository.findAll())
                .thenReturn(iterator);
        List<Booking> booking1 = service.getAllBookings();

        assertTrue(booking1.size()==1);

    }
}
