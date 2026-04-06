package com.cab.cbs.exceptions.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SucessResponse {

	public SucessResponse(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	int status;
	String message;
}
