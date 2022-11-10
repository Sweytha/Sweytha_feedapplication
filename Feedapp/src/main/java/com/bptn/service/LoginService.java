package com.bptn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bptn.exceptions.InvalidUserCredentialsException;
import com.bptn.models.UserID;
import com.bptn.repository.LoginRepository;

@Service
public class LoginService {
	
    private final Logger LOGGER=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginRepository loginRepository;
	
	 public String validateUserCredentials(UserID userCred) throws InvalidUserCredentialsException{
		 List<UserID> userentity=loginRepository.getUserByUserId(userCred.getUsername());
		 
		 for(UserID u:userentity) {
			 
			 LOGGER.info("Retrieving username from the database");
			 
			 if(u.getUsername().equals(userCred.getUsername())) 
				 
				 if(u.getUserPassword().equals(userCred.getUserPassword())) 
					 return "Login is successfull";
				 else
					 return "Password incorrect"+ new InvalidUserCredentialsException("Password is incorrect");
				
		 }
		 return "User login issue" +new InvalidUserCredentialsException("User login is invalid");
		 
		 
	 }
	
	

}
