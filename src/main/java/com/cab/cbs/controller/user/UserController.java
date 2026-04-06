package com.cab.cbs.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cab.cbs.models.UserRegistration;
import com.cab.cbs.services.UserServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public UserRegistration userRegistration(@Valid @RequestBody UserRegistration userRegistration) {
        return userService.userRegistration(userRegistration);
    }

}
