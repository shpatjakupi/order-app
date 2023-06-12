package com.foodapp.foodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodapp.foodapp.dao.MenuDAO;
import com.foodapp.foodapp.dto.FillingDTO;
import com.foodapp.foodapp.dto.FoodDTO;
import com.foodapp.foodapp.dto.SidesDTO;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;
	
	
	@Override
	@Transactional
	public List<FoodDTO> getFood() {
		return menuDAO.getFood();
	}


	@Override
	@Transactional
	public List<FillingDTO> getFillingProducts() {
		return menuDAO.getFillingProducts();
	}


	@Override
	@Transactional
	public List<SidesDTO> getSidesProducts() {
		return menuDAO.getSidesProducts();
	}


}
