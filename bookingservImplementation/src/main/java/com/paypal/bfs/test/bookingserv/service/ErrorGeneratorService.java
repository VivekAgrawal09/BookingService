package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.entity.Booking;
import com.paypal.bfs.test.bookingserv.api.entity.ErrorDetails;
import com.paypal.bfs.test.bookingserv.api.entity.ResponseStatus;
import com.paypal.bfs.test.bookingserv.exception.DBConnectionException;
import com.paypal.bfs.test.bookingserv.exception.DuplicateBookingException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ErrorGeneratorService {

	public Booking prepareErrorResponse(Throwable ex) {
		Booking errorResponse = new Booking();
		errorResponse.setResponseStatus(ResponseStatus.FAILED);
		if (ex instanceof DBConnectionException) {
			
			ErrorDetails errorDetail = new ErrorDetails();
			errorDetail.setErrorCode("4009123");
			errorDetail.setErrorMessage("DB Connection Failed");
			errorDetail.setErrorDescription("Error while creating entry in DB");
			errorDetail.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			//errorDetails.add(errorDetail);
			errorResponse.setErrorDetails(errorDetail);
			
			errorResponse.setErrorDetails(errorDetail);
		} else if(ex instanceof DuplicateBookingException) {
			ErrorDetails errorDetail = new ErrorDetails();
			errorDetail.setErrorCode("4009124");
			errorDetail.setErrorMessage("Duplicate Booking");
			errorDetail.setErrorDescription("This booking already exists");
			errorDetail.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			errorResponse.setErrorDetails(errorDetail);
		}

		return errorResponse;
	}

}
