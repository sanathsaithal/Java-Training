package com.wolken.hackerrank.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.entity.HackerrankUserEntity;
import com.wolken.hibernateUtils.util.HibernateUtils;

public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO dao=new RegistrationDAOImpl();
	@Override
	public String validateAndSave(UserDTO dto) {
		HackerrankUserEntity entity=new HackerrankUserEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setContact(dto.getContact());
		
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
	
		}
}
