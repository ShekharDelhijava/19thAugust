package com.iiht.ecoronakit.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserResponseDTO {

	
	@Length(min = 2, max = 10)
	@NotNull
    private long userId;
	@Length(min = 2, max = 10)
	@NotNull
    private String firstName;
	@Length(min = 2, max = 10)
	
    private String lastName;
	@Length(min = 5, max = 10)
	@NotNull
    private String username;

//    private String password;

	@NotNull
    private String email;

    private AddressDTO address;

    private String role;

}
