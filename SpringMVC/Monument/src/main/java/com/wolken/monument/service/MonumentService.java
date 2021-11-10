package com.wolken.monument.service;

import java.util.List;

import com.wolken.monument.dto.MonumentDto;
import com.wolken.monument.entity.MonumentEntity;


public interface MonumentService {

	void save(MonumentDto dto);

	List getAll();

	

}
