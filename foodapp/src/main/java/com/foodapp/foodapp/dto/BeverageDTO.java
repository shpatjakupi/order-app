package com.foodapp.foodapp.dto;

import com.foodapp.foodapp.entity.Beverage;

public class BeverageDTO {
	private int id;
	private String name;
	private String description;
	private int price;

	public BeverageDTO() {
		
	}
	
	public BeverageDTO(Beverage beverage) {
		this.id = beverage.getId();
		this.name = beverage.getName();
		this.description = beverage.getDescription();
		this.price = beverage.getPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BeverageDTO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}