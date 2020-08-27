package com.iboss.us.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iboss.us.Entity.User;
import com.iboss.us.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	Logger logger = LoggerFactory.getLogger(UserService.class);

	public User createUser(User user) throws JsonProcessingException {
		logger.info("User-Service Request : {}", new ObjectMapper().writeValueAsString(user));
		return userRepository.save(user);
	}

	public User findUserDetailsByUserId(int userId) throws JsonProcessingException {
		User user = userRepository.findByUserId(userId);
		logger.info("UserService findUserDetailsByUserId : {}", new ObjectMapper().writeValueAsString(user));
		return user;
	}
}
