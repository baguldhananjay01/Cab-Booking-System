package com.cab.cbs.controller.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cab.cbs.models.dto.CabRouteDTO;
import com.cab.cbs.services.CabServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cab/route/")
public class CabRouteController {

	@Autowired
	CabServices cabService;

	@PostMapping("{cab_id}")
	@ResponseStatus(HttpStatus.OK)
	public CabRouteDTO cabRouteRegister(@PathVariable("cab_id") int cabId,
			@Valid @RequestBody CabRouteDTO cabRouteDTO) {
		return cabService.cabRouteRegister(cabId, cabRouteDTO);
	}

}

