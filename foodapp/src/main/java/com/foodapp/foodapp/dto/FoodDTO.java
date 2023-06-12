package com.foodapp.foodapp.dto;

import com.foodapp.foodapp.entity.Food;

public class FoodDTO {
	private int id;
	private String name;
	private String description;
	private int price;
	private String foodKey;

	public String getFoodKey() {
		return foodKey;
	}

	public void setFoodKey(String foodKey) {
		this.foodKey = foodKey;
	}

	public FoodDTO() {
		
	}
	
	public FoodDTO(Food food) {
		this.id = food.getId();
		this.name = food.getName();
		this.description = food.getDescription();
		this.price = food.getPrice();
		this.foodKey = food.getKey();
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
		return "FoodDTO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}
