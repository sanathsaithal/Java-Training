package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.HackerrankUserEntity;

public interface RegistrationDAO {

	int save(HackerrankUserEntity entity);

}
