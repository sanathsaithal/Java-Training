package com.wolken.monument.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.wolken.monument.dao.MonumentDao;
import com.wolken.monument.dao.MonumentDaoImpl;
import com.wolken.monument.dto.MonumentDto;
import com.wolken.monument.entity.MonumentEntity;



@Component
public class MonumentServiceImpl implements MonumentService {
@Autowired
	MonumentDao dao;
		public void save(MonumentDto dto) {
			MonumentEntity entity=new MonumentEntity();
			
				if(!dto.getName().equals(null) && !dto.getName().equals("")) {
					if(!dto.getArea().equals(null) && !dto.getArea().equals("")) {
						if(!dto.getStyle().equals(null) && !dto.getStyle().equals("")) {
							if(dto.getYear()>0) {
								
								entity.setName(dto.getName());
								entity.setArea(dto.getArea());
								entity.setStyle(dto.getStyle());
								entity.setYear(dto.getYear());
								
								BeanUtils.copyProperties(dto, entity);
								dao.save(entity);
							} else
						
								
									System.out.println("year not valid");
							} else
								System.out.println("Style not added");
						}else
							System.out.println("Area not added");
					}else
						System.out.println("enter valid name");
				}
		
		
		public List getAll() {
			MonumentEntity entity=new MonumentEntity();
			List list=dao.getAll();
			return list;
		}
		
				
			
		}
		
	


