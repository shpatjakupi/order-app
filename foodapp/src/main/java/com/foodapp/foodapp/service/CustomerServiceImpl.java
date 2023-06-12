package com.foodapp.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodapp.foodapp.dao.CustomerDAO;
import com.foodapp.foodapp.dto.ItemDTO;
import com.foodapp.foodapp.dto.OrderDTO;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public void saveOrder(OrderDTO orderDTO, List<ItemDTO> items) {
		customerDAO.saveOrder(orderDTO, items);

	}
	
	

}
