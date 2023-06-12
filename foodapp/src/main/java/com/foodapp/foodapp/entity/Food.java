package com.foodapp.foodapp.entity;

import jakarta.persistence.*;


@Entity
@Table(name="Food")
public class Food extends Product {
	@Column(name="Food_key")
	private String Key;
	
	public Food() {
		
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}

}