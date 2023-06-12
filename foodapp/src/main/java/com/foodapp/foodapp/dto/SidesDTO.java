package com.foodapp.foodapp.dto;

import com.foodapp.foodapp.entity.Sides;

public class SidesDTO {
	private int id;
	private String name;
	private String description;
	private int price;

	public SidesDTO() {
		
	}
	
	public SidesDTO(Sides Sides) {
		this.id = Sides.getId();
		this.name = Sides.getName();
		this.description = Sides.getDescription();
		this.price = Sides.getPrice();
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
		return "SidesDTO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}