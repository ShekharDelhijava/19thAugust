package com.iiht.ecoronakit.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductDTO {
	
	@Length(min = 2, max = 30)
	@NotNull

    private String productName;
	
	
	@NotNull
    private String productCost;
	
    private byte[] productImage;
	@Length(min = 5, max = 30)
	@NotNull
    private String productDescription;
	@Length(min = 5, max = 30)
	@NotNull
    private String productSpecification;
	@Length(min = 5, max = 30)
	@NotNull
    private String category;
	
    private Long barcode;
}
