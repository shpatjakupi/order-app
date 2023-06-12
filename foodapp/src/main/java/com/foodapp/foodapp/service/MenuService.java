package com.foodapp.foodapp.service;

import java.util.List;

import com.foodapp.foodapp.dto.FillingDTO;
import com.foodapp.foodapp.dto.FoodDTO;
import com.foodapp.foodapp.dto.SidesDTO;



public interface MenuService {
	
	public List<FoodDTO> getFood();
	public List<FillingDTO> getFillingProducts();
    public List<SidesDTO> getSidesProducts();

}

