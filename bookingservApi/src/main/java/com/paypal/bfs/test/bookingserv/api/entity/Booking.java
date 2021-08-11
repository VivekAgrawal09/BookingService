
package com.paypal.bfs.test.bookingserv.api.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Booking resource
 * <p>
 * Booking resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "dob",
    "checkin_datetime",
    "checkout_datetime",
    "totalprice",
    "deposit",
    "address"
})
@Generated("jsonschema2pojo")
@Entity
public class Booking {

    /**
     * Booking id
     * 
     */
    @Id
    @GeneratedValue
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    private Integer id;
    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    @NotBlank(message = "First Name is mandatory")
    private String firstName;
    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;
    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("dob")
    @JsonPropertyDescription("Date of Birth")
    @NotBlank(message = "Dob is mandatory")
    private String dob;
    /**
     * Checkin DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    @JsonPropertyDescription("Checkin DateTime")
    @NotBlank(message = "CheckinDate is mandatory")
    private String checkinDatetime;
    /**
     * Checkout DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    @JsonPropertyDescription("Checkout DateTime")
    @NotBlank(message = "CheckoutDate is mandatory")
    private String checkoutDatetime;
    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    @JsonPropertyDescription("Total Price")
    @NotNull
    private Integer totalprice;
    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("Deposit")
    @NotNull
    private Integer deposit;
    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address")
    @Valid
    private Address address;

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Checkin DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    public String getCheckinDatetime() {
        return checkinDatetime;
    }

    /**
     * Checkin DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    public void setCheckinDatetime(String checkinDatetime) {
        this.checkinDatetime = checkinDatetime;
    }

    /**
     * Checkout DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    public String getCheckoutDatetime() {
        return checkoutDatetime;
    }

    /**
     * Checkout DateTime
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    public void setCheckoutDatetime(String checkoutDatetime) {
        this.checkoutDatetime = checkoutDatetime;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public Integer getTotalprice() {
        return totalprice;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("status")
    private ResponseStatus responseStatus;

    @JsonProperty("err")
    private ErrorDetails errorDetails;

    @JsonProperty("warning")
    private ErrorDetails warning;

    /**
     * @return the responseStatus
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * @param responseStatus
     *            the responseStatus to set
     */
    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * @return the errorDetails
     */
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    /**
     * @param errorDetails
     *            the errorDetails to set
     */
    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    public ErrorDetails getWarning() {
        return warning;
    }

    public void setWarning(ErrorDetails warning) {
        this.warning = warning;
    }

}
