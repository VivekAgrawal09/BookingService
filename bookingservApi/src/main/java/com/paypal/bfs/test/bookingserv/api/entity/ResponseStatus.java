package com.paypal.bfs.test.bookingserv.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public enum ResponseStatus {
		FAILED, SUCCESS;

		public static ResponseStatus create(String input) {
			ResponseStatus[] responseStatusVal = ResponseStatus.values();
			for (ResponseStatus responseStatus : responseStatusVal) {
				if (responseStatus.name().equals(input)) {
					return responseStatus;
				}
			}
			return null;
		}
}
