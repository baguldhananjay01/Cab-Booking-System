package com.cab.cbs.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cab.cbs.exceptions.DataNotFoundException;
import com.cab.cbs.models.CustomUserDetail;
import com.cab.cbs.models.UserRegistration;
import com.cab.cbs.repository.UserRepo;



@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserRegistration user=userRepo.findByUsername(username);
		if(user==null)
		{
			throw new DataNotFoundException("please enter valid username");
		}
		
		return new CustomUserDetail(user);
	}

}
