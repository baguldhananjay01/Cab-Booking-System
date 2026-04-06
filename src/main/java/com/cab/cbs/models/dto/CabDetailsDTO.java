package com.cab.cbs.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CabDetailsDTO {

	private Integer cabId;

	private String cabNumber;

	private String cabDriverName;

	private long cabDriverMobileNumber;

	private String cabModel;

	private String cabStatus;

	public Integer getCabId() {
		return cabId;
	}

	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}

	public String getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}

	public String getCabDriverName() {
		return cabDriverName;
	}

	public void setCabDriverName(String cabDriverName) {
		this.cabDriverName = cabDriverName;
	}

	public long getCabDriverMobileNumber() {
		return cabDriverMobileNumber;
	}

	public void setCabDriverMobileNumber(long cabDriverMobileNumber) {
		this.cabDriverMobileNumber = cabDriverMobileNumber;
	}

	public String getCabModel() {
		return cabModel;
	}

	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}

	public String getCabStatus() {
		return cabStatus;
	}

	public void setCabStatus(String cabStatus) {
		this.cabStatus = cabStatus;
	}
	
	
	

	/*
	 * {
	 * "cabNumber":"1234789",
	 * "cabDriverName":"Suresh",
	 * "cabDriverMobileNumber":9832742352
	 * "cabModel":"Sedan",
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */

}
