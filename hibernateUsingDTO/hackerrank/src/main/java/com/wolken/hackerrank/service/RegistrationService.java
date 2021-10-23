package com.wolken.hackerrank.service;

import com.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {

	String validateAndSave(UserDTO dto);
	
}
