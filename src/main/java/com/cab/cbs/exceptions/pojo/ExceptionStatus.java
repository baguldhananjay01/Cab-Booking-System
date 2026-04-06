package com.cab.cbs.exceptions.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionStatus {

	public ExceptionStatus(Date date, int i, String string, String message) {
		// TODO Auto-generated constructor stub
	}
	Date timestamp;
	int status;
	String error;
	String description;

}

