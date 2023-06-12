package com.foodapp.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodapp.foodapp.dao.AdminDAO;
import com.foodapp.foodapp.dto.OrderDTO;



@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	@Transactional
	public List<OrderDTO> getOrdersFromToday() {
		return adminDAO.getOrdersFromToday();
	}
	
	@Override
	@Transactional
	public List<OrderDTO> getOrderByDate(String dateKey) {
		return adminDAO.getOrderByDate(dateKey);
	}

	@Override
	@Transactional
	public void setOrderToDone(int orderId) {
		adminDAO.setOrderToDone(orderId);

	}
	
}
