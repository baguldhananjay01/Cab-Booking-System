package com.cab.cbs.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "cabRoute")
@Entity
public class CabRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabRouteId;

	// Cab Details Table Foreign Key cab_id
	@Column(name = "fk_cab_id")
	private Integer cabId;

	private String source;

	private String destination;

	private int distance;

	private int duration;

	// Cab Details Table cab_id mapped Cab Route Table or Entity
	@ManyToOne
	@JoinColumn(name = "fk_cab_id", insertable = false, updatable = false)
	private CabDetails cabDetails;

	public Integer getCabRouteId() {
		return cabRouteId;
	}

	public void setCabRouteId(Integer cabRouteId) {
		this.cabRouteId = cabRouteId;
	}

	public Integer getCabId() {
		return cabId;
	}

	public void setCabId(Integer cabId) {
		this.cabId = cabId;
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

	public CabDetails getCabDetails() {
		return cabDetails;
	}

	public void setCabDetails(CabDetails cabDetails) {
		this.cabDetails = cabDetails;
	}
	
	
	

}
