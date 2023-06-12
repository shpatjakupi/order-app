package com.foodapp.foodapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import jakarta.persistence.EntityManager;

import com.foodapp.foodapp.dto.ItemDTO;
import com.foodapp.foodapp.dto.OrderDTO;
import com.foodapp.foodapp.entity.Item;
import com.foodapp.foodapp.entity.Order;


@Repository
public class CustomerDAOImpl implements CustomerDAO {


	private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public CustomerDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
	
	@Override
	public void saveOrder(OrderDTO orderDTO, List<ItemDTO> items) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Order order = new Order();
		order.setOrderedDate(orderDTO.getOrderedDate());
		order.setPickUpDate(orderDTO.getPickUpDate());
		order.setDetails(orderDTO.getDetails());
		order.setFullPrice(orderDTO.getFullPrice());
		order.setName(orderDTO.getName());
		order.setPreOrder(orderDTO.isPreOrder());
		order.setOrderDone(orderDTO.isOrderDone());;
		currentSession.saveOrUpdate(order);
        
        for(ItemDTO itemdto : items) {
        	Item item = new Item();
        	item.setDetails(itemdto.getDetails());
        	item.setOrder(order);
        	currentSession.saveOrUpdate(item);
        }

	}
	


}
