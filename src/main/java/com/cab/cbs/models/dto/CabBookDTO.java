package com.cab.cbs.models.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CabBookDTO {

	private Integer cabBookId;

	@NotNull(message = "customerNumber should not be null")
	private String customerNumber;

	@NotNull(message = "customerName should not be null")
	private String customerName;

	@NotNull(message = "source should not be null")
	private String source;

	@NotNull(message = "destination should not be null")
	private String destination;

	public Integer getCabBookId() {
		return cabBookId;
	}

	public void setCabBookId(Integer cabBookId) {
		this.cabBookId = cabBookId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	

}
