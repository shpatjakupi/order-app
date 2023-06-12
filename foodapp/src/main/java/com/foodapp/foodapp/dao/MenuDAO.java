package com.foodapp.foodapp.dao;

import java.util.List;

import com.foodapp.foodapp.dto.BeverageDTO;
import com.foodapp.foodapp.dto.ComboDTO;
import com.foodapp.foodapp.dto.FillingDTO;
import com.foodapp.foodapp.dto.FoodDTO;
import com.foodapp.foodapp.dto.SidesDTO;



public interface MenuDAO {
	public List<FoodDTO> getFood();
	public List<BeverageDTO> getBeverageProducts();
    public List<FillingDTO> getFillingProducts();
    public List<SidesDTO> getSidesProducts();
    public List<ComboDTO> getComboProducts();
    
    public void addFood(FoodDTO foodDTO);
    public void addBeverage(BeverageDTO beverageDTO);
    public void addFilling(FillingDTO fillingDTO);
    public void addSides(SidesDTO sidesDTO);
    public void addCombo(ComboDTO comboDTO);
    
    public void deleteFood(int foodIt);
    public void deleteBeverage(int beverageId);
    public void deleteFilling(int fillingId);
    public void deleteSides(int sidesId);
    public void deleteCombo(int comboId);


}

