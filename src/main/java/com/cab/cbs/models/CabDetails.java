package com.cab.cbs.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "cabDetails")
@Entity
public class CabDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cab_id")
	private Integer cabId;

	@NotNull(message = "Cab number should not be null")
	private String cabNumber;

	@NotNull(message = "Cab Driver name should not be null")
	private String cabDriverName;

	@NotNull(message = "Cab Model should not be null")
	private String cabModel;

	@NotNull(message = "Cab Driver Mobile Number should not be null")
	private long cabDriverMobileNumber;

	private boolean cabStatus;

	// Mapped cab_id to Cab Route Table or Entity
	@OneToMany(mappedBy = "cabDetails")
	private List<CabRoute> cabRoutes;

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

	public long getCabDriverMobileNumber() {
		return cabDriverMobileNumber;
	}

	public void setCabDriverMobileNumber(long cabDriverMobileNumber) {
		this.cabDriverMobileNumber = cabDriverMobileNumber;
	}

	public boolean isCabStatus() {
		return cabStatus;
	}

	public void setCabStatus(boolean cabStatus) {
		this.cabStatus = cabStatus;
	}

	public List<CabRoute> getCabRoutes() {
		return cabRoutes;
	}

	public void setCabRoutes(List<CabRoute> cabRoutes) {
		this.cabRoutes = cabRoutes;
	}
	
	
	

}
