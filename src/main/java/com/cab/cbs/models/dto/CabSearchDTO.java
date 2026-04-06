package com.cab.cbs.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CabSearchDTO {

	// Cab Details Fields

	private Integer cabId;

	private String cabNumber;

	private String cabDriverName;

	private String cabModel;

	private String cabStatus;

	private long cabDriverMobileNumber;

	// Cab Route Fields

	private Integer cabRouteId;

	private String source;

	private String destination;

	private int distance;

	private int duration;

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

	public long getCabDriverMobileNumber() {
		return cabDriverMobileNumber;
	}

	public void setCabDriverMobileNumber(long cabDriverMobileNumber) {
		this.cabDriverMobileNumber = cabDriverMobileNumber;
	}

	public Integer getCabRouteId() {
		return cabRouteId;
	}

	public void setCabRouteId(Integer cabRouteId) {
		this.cabRouteId = cabRouteId;
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

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
