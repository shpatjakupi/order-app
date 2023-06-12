package com.foodapp.foodapp.dto;

import com.foodapp.foodapp.entity.Combo;

public class ComboDTO {
	private int id;
	private String name;
	private String description;
	private int price;

	public ComboDTO() {
		
	}
	
	public ComboDTO(Combo combo) {
		this.id = combo.getId();
		this.name = combo.getName();
		this.description = combo.getDescription();
		this.price = combo.getPrice();
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
		return "ComboDTO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}