package com.foodapp.foodapp.service;

import java.util.List;

import com.foodapp.foodapp.dto.OrderDTO;


public interface AdminService {
	public List<OrderDTO> getOrdersFromToday();
	public List<OrderDTO> getOrderByDate(String dateKey);
	public void setOrderToDone(int orderId);
}
