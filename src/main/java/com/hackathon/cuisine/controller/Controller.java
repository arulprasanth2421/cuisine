package com.hackathon.cuisine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.hackathon.cuisine.dto.MenuDto;
import com.hackathon.cuisine.dto.RestoDto;
import com.hackathon.cuisine.service.CuisineService;

@RestController

public class Controller {
	
	@Autowired
	CuisineService service;
	
	@GetMapping(value="/view", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<MenuDto> getMenu(){
		System.out.println("start");
		List<MenuDto> menuDto=service.getMenu();
		return menuDto;
	}
	@GetMapping(value="/restaurant/{restaurantid}", produces= MediaType.APPLICATION_JSON_VALUE)
	public RestoDto getResto(@PathVariable Integer restaurantid){
		System.out.println("start");
		RestoDto restoDto=service.getRestoById(restaurantid);
		System.out.println("after");
		return restoDto;
	}
	
//	@GetMapping("/resto/{id}")
//	public RestoDto getRestoById(int id) {
//		return service.getRestoById(id);
//	}
//	
}
	
	
	
	
	
	
	
	
	
	
	

