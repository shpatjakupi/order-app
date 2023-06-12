package com.foodapp.foodapp.service;

import java.util.List;

import com.foodapp.foodapp.dto.ItemDTO;
import com.foodapp.foodapp.dto.OrderDTO;



public interface CustomerService {
	public void saveOrder(OrderDTO orderDTO, List<ItemDTO> items);
	
}
