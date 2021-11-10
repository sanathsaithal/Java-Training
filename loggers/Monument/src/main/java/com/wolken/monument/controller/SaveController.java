package com.wolken.monument.controller;

import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.monument.dao.MonumentDao;
import com.wolken.monument.dto.MonumentDto;
import com.wolken.monument.entity.MonumentEntity;
import com.wolken.monument.service.MonumentService;

@Controller

public class SaveController {
	@Autowired
	//MonumentDao dao;
	MonumentService service;
	Logger logger=Logger.getLogger(SaveController.class);
@RequestMapping(value="save", method= RequestMethod.POST)

ModelAndView saveDetails(MonumentDto dto)
{
	ModelAndView view = new ModelAndView();
	logger.info(dto);
	MonumentEntity entity=new MonumentEntity();
//	BeanUtils.copyProperties(dto, entity);
	service.save(dto);
	view.setViewName("hello.jsp");
	view.addObject("msg", "data saved");
	view.addObject("data", dto);
	return view;
}

@RequestMapping("getAll")
ModelAndView getAll()
{
	ModelAndView view=new ModelAndView("hello");
	logger.info("data saved");
	List list=service.getAll();
	view.addObject("list", list);
	return view;
}
}
