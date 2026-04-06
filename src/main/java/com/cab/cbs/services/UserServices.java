package com.cab.cbs.services;

import java.util.List;

import com.cab.cbs.exceptions.pojo.SucessResponse;
import com.cab.cbs.models.UserRegistration;



public interface UserServices {

	public UserRegistration userRegistration(UserRegistration userRegistration);

	public List<UserRegistration> getUser();

	public UserRegistration login(String username, String password);

	public SucessResponse forgotPassword(String username, String password);
	
	public SucessResponse sendEmail();

	public SucessResponse verifyEmail(int user_otp);


}
