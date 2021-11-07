package com.wolken.bus;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.bus.dto.BusDto;
import com.wolken.bus.services.BusService;



/**
 * Hello world!
 *
 */
public class App 
{
    	static Scanner sc=new Scanner(System.in);
        public static void main( String[] args )
        {
            BusDto dto=new BusDto();
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
            System.out.println("enter capacity");
            int capacity=sc.nextInt();
            sc.nextLine();
            System.out.println("enter bus model");
            String model=sc.nextLine();
            System.out.println("enter contact no");
            long contact=sc.nextLong();
            
            BusService service=(BusService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("busservice");
            
            dto.setId(id);
            dto.setName(name);     
            dto.setCapacity(capacity);
            dto.setModel(model);
            dto.setContact(contact);
            
            String result=service.validateAndSave(dto);
    		System.out.println(result);
            
        }
    }

