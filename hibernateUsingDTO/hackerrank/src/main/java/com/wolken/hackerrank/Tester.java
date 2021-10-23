package com.wolken.hackerrank;

import java.util.Scanner;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.service.RegistrationService;
import com.wolken.hackerrank.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg)
	{
		RegistrationService service=new RegistrationServiceImpl();
		
		UserDTO dto=new UserDTO();
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter contact");
		long contact=sc.nextLong();
		
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setContact(contact);
		
		String result=service.validateAndSave(dto);
		System.out.println(result);
	}
	
}

