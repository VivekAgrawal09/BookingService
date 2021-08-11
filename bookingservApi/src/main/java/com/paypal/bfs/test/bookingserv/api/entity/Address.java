
package com.paypal.bfs.test.bookingserv.api.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;


/**
 * Address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line1",
    "line2",
    "city",
    "state",
    "zip_code"
})
@Generated("jsonschema2pojo")
@Embeddable
public class Address {

    /**
     * Line1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("Line1")
    @NotBlank(message = "Line1 is mandatory")
    private String line1;
    /**
     * Line2
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("Line2")
    private String line2;
    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    @NotBlank(message = "city is mandatory")
    private String city;
    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State")
    @NotBlank(message = "state is mandatory")
    private String state;
    /**
     * Zip Code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("Zip Code")
    @NotBlank(message = "zipCode is mandatory")
    private String zipCode;

    /**
     * Line1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * Line1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Line2
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * Line2
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Zip Code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Zip Code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
