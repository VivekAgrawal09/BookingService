package com.paypal.bfs.test.bookingserv.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "statusCode", "ec", "em", "ed", "sn", "downStreamErrors" })
public class ErrorDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonProperty("statusCode")
	private int statusCode;
	@JsonProperty("ec")
	private String errorCode;
	@JsonProperty("em")
	private String errorMessage;
	@JsonProperty("ed")
	private String errorDescription;
	@JsonProperty("sn")
	private String serviceName;
	private List<ErrorDetails> downStreamErrors;

	public ErrorDetails() {

	}

	public ErrorDetails(ErrorDetails input) {
		this.setStatusCode(input.getStatusCode());
		this.setErrorCode(input.getErrorCode());
		this.setErrorDescription(input.getErrorDescription());
		this.setErrorMessage(input.getErrorMessage());
		this.setServiceName(input.getServiceName());
		if (null != input.getDownStreamErrors()) {
			this.setDownStreamErrors(input.getDownStreamErrors());
		}
	}

	public ErrorDetails(String code, String message, String desciption, int statusCode) {
		this.errorCode = code;
		this.errorMessage = message;
		this.errorDescription = desciption;
	}

	public ErrorDetails(String code, String message, String desciption) {
		this.errorCode = code;
		this.errorMessage = message;
		this.errorDescription = desciption;
	}

	public ErrorDetails(int httpStatusCode, String code, String message, String desciption) {
		this.statusCode = httpStatusCode;
		this.errorCode = code;
		this.errorMessage = message;
		this.errorDescription = desciption;
	}

	public ErrorDetails(String code, String message, String desciption, String serviceName) {
		this.errorCode = code;
		this.errorMessage = message;
		this.errorDescription = desciption;
		this.serviceName = serviceName;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription
	 *            the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the downStreamErrors
	 */
	public List<ErrorDetails> getDownStreamErrors() {
		return downStreamErrors;
	}

	/**
	 * @param downStreamErrors
	 *            the downStreamErrors to set
	 */
	public void setDownStreamErrors(List<ErrorDetails> downStreamErrors) {
		this.downStreamErrors = downStreamErrors;
	}

}
