package com.foodapp.foodapp.dao;

import java.util.List;

import com.foodapp.foodapp.dto.OrderDTO;


public interface AdminDAO {
	public List<OrderDTO> getOrdersFromToday();
	public List<OrderDTO> getOrderByDate(String dateKey);
	public void setOrderToDone(int orderId);
}
