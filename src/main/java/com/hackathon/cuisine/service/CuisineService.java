package com.hackathon.cuisine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.cuisine.dto.MenuDto;
import com.hackathon.cuisine.dto.RestoDto;
import com.hackathon.cuisine.entity.MenuEntity;
import com.hackathon.cuisine.entity.RestoEntity;
import com.hackathon.cuisine.repository.MenuRepository;
import com.hackathon.cuisine.repository.RestoRepository;


@Service
public class CuisineService {
	@Autowired
	MenuRepository menu;
	
	@Autowired
	RestoRepository resto;
	
	public List<MenuDto> getMenu() {
		List<MenuDto> l=new ArrayList<MenuDto>();
		List<MenuEntity> oe=menu.findAll();
		for(MenuEntity O: oe) {
		MenuDto dto=MenuDto.valueof(O);
		l.add(dto);
		}
		return l;
	}
	
	public RestoDto getRestoById(Integer restaurantid) {
		System.out.println("before");
		RestoEntity oe=resto.getOne(restaurantid);
		System.out.println("middle");
		RestoDto O=RestoDto.valueof(oe);
		System.out.println("after");
		return O;
	}

}
