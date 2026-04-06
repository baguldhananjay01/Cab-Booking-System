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

@Table(name = "cabBook")
@Entity
public class CabBook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer cabBookId;

	private String customerName;

	private String customerNumber;

	private String source;

	private String destination;

	// Foreign Key From Cab Details
	@Column(name = "fk_cab_id")
	private Integer cab_id;

	// Foreign Key cab_id
	@ManyToOne
	@JoinColumn(name = "fk_cab_id", insertable = false, updatable = false)
	private CabDetails cabDetails;

	public Integer getCabBookId() {
		return cabBookId;
	}

	public void setCabBookId(Integer cabBookId) {
		this.cabBookId = cabBookId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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

	public Integer getCab_id() {
		return cab_id;
	}

	public void setCab_id(Integer cab_id) {
		this.cab_id = cab_id;
	}

	public CabDetails getCabDetails() {
		return cabDetails;
	}

	public void setCabDetails(CabDetails cabDetails) {
		this.cabDetails = cabDetails;
	}
	
	
	

}
