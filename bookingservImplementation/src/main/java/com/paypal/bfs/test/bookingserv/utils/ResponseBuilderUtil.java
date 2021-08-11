package com.paypal.bfs.test.bookingserv.utils;

import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.service.ErrorGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResponseBuilderUtil {
	@Autowired
	private ErrorGeneratorService errroService;

	public ResponseEntity<Booking> buildErrorResponse(Throwable t) {
		Booking errorResponse = errroService.prepareErrorResponse(t);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR) ;
	}

	public ResponseEntity<List<Booking>> buildErrorResponseforList(Throwable t) {
		List<Booking> list = new ArrayList<>();
		Booking errorResponse = errroService.prepareErrorResponse(t);
		list.add(errorResponse);
		return new ResponseEntity<>(list, HttpStatus.INTERNAL_SERVER_ERROR) ;
	}

	public ResponseEntity<Booking> buildResponse(Booking responseObject) {
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}

	public <T> ResponseEntity<List<Booking>> buildResponseforList(List<Booking> responseObject) {
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
}
