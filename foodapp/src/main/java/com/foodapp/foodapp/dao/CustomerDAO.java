package com.foodapp.foodapp.dao;

import java.util.List;

import com.foodapp.foodapp.dto.ItemDTO;
import com.foodapp.foodapp.dto.OrderDTO;

public interface CustomerDAO {
	public void saveOrder(OrderDTO orderDTO, List<ItemDTO> items);
	
}
