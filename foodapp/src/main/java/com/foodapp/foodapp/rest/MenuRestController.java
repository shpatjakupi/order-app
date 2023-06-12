package com.foodapp.foodapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foodapp.foodapp.service.MenuService;


@RestController
@RequestMapping("/menu")
public class MenuRestController {
	@Autowired
	private MenuService menuService;
	
	
	@GetMapping("/food") 
	public ResponseEntity<?> showFoods() {
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//		    String jsonData = objectMapper.writeValueAsString(menuService.getFood());
//		    System.out.println(jsonData);
//		} catch (JsonProcessingException e) {
//		    e.printStackTrace();
//		}
		return new ResponseEntity<>(menuService.getFood(),HttpStatus.OK);
		
		
	}
	
	@GetMapping("/filling")
	public ResponseEntity<?> showFillings() {
		return new ResponseEntity<>(menuService.getFillingProducts(),HttpStatus.OK);
		
		
	}
	@GetMapping("/sides") 
	public ResponseEntity<?> showSides() {

		return new ResponseEntity<>(menuService.getSidesProducts(),HttpStatus.OK);	
		
	}
}
