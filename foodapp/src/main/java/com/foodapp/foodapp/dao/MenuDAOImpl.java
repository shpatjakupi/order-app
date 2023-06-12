package com.foodapp.foodapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodapp.foodapp.dto.BeverageDTO;
import com.foodapp.foodapp.dto.ComboDTO;
import com.foodapp.foodapp.dto.FillingDTO;
import com.foodapp.foodapp.dto.FoodDTO;
import com.foodapp.foodapp.dto.SidesDTO;
import com.foodapp.foodapp.entity.Filling;
import com.foodapp.foodapp.entity.Food;
import com.foodapp.foodapp.entity.Sides;

import jakarta.persistence.EntityManager;


@Repository
public class MenuDAOImpl implements MenuDAO {

	private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public MenuDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    
	@Override
	public List<FoodDTO> getFood() {
		
		Session currentSession = entityManager.unwrap(Session.class);
	    
	    // create a query... sort by id in descending order
	    Query<Food> theQuery = currentSession.createQuery("from Food order by id desc",Food.class);
	    
	    // execute query and get the result list
	    List<Food> list = theQuery.getResultList();
		
		List<FoodDTO> foodDTOList = new ArrayList<>();
		for(Food food : list) {
			foodDTOList.add(new FoodDTO(food));
		}
	  
	    
	    return foodDTOList;
	}

	@Override
	public List<FillingDTO> getFillingProducts() {
		Session currentSession = entityManager.unwrap(Session.class);
	    
	    // create a query... sort by id in descending order
	    Query<Filling> theQuery = currentSession.createQuery("from Filling order by id desc",Filling.class);
	    
	    // execute query and get the result list
	    List<Filling> list = theQuery.getResultList();
		
		List<FillingDTO> fillingDTOList = new ArrayList<>();
		for(Filling filling : list) {
			fillingDTOList.add(new FillingDTO(filling));
		}
	  
	    
	    return fillingDTOList;
	}
	
	@Override
	public List<SidesDTO> getSidesProducts() {
		Session currentSession = entityManager.unwrap(Session.class);
	    
	    // create a query... sort by id in descending order
	    Query<Sides> theQuery = currentSession.createQuery("from Sides order by id desc",Sides.class);
	    
	    // execute query and get the result list
	    List<Sides> list = theQuery.getResultList();
		
		List<SidesDTO> sidesDTOList = new ArrayList<>();
		for(Sides sides : list) {
			sidesDTOList.add(new SidesDTO(sides));
		}
	  
	    
	    return sidesDTOList;
	}
	
	@Override
	public List<BeverageDTO> getBeverageProducts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ComboDTO> getComboProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFood(FoodDTO foodDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBeverage(BeverageDTO beverageDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFilling(FillingDTO fillingDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFood(int foodIt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBeverage(int beverageId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilling(int fillingId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSides(SidesDTO sidesDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCombo(ComboDTO comboDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSides(int sidesId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCombo(int comboId) {
		// TODO Auto-generated method stub
		
	}

}
