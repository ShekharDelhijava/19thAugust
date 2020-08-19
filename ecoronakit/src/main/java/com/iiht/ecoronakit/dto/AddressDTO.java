package com.iiht.ecoronakit.dto;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.*;


//@Getter
//@Setter
//@Getter
//@Setter
public class AddressDTO {

	@Length(min = 5, max = 10)
	@NotNull
    private String postboxNo;

	@Length(min = 5, max = 30)
	@NotNull
    private String landmark;

	@Length(min = 5, max = 10)
	@NotNull
    private String zipcode;

	@Length(min = 10, max = 10)
	@NotNull
    private String phoneNumber;
	@Length(min = 5, max = 10)
	@NotNull
    private String city;
	@Length(min = 5, max = 30)
	@NotNull
    public AddressDTO() {}

    public String getPostboxNo() {
        return postboxNo;
    }

    public void setPostboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
