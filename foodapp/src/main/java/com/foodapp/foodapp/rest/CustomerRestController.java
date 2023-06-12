package com.foodapp.foodapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.foodapp.dto.ParseOrderDTO;
import com.foodapp.foodapp.service.CustomerService;
import com.foodapp.foodapp.service.MenuService;



@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	private CustomerService CustomerService;
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping("/sendOrder") 
	public ResponseEntity<String> addOrder(@RequestBody ParseOrderDTO req) {
		CustomerService.saveOrder(req.getOrder(), req.getItems());
	 
		return new ResponseEntity<>("The shop has got the order!", HttpStatus.OK);

	}
	

}
