package com.cab.cbs.controller.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cab.cbs.exceptions.pojo.SucessResponse;
import com.cab.cbs.models.dto.CabBookDTO;
import com.cab.cbs.services.CabServices;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/cab/book/")
public class CabBookingController {

	@Autowired
	CabServices cabService;

	@PostMapping("{cab_id}")
	@ResponseStatus(HttpStatus.OK)
	public CabBookDTO cabBook(@PathVariable("cab_id") int cabId, @Valid @RequestBody CabBookDTO cabBookDTO) {
		return cabService.cabBook(cabId, cabBookDTO);
	}

	@DeleteMapping("{book_id}")
	@ResponseStatus(HttpStatus.OK)
	public SucessResponse cabBook(@PathVariable("book_id") int bookId) {
		return cabService.cabBookDelete(bookId);
	}

}

