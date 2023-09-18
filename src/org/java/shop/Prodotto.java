package org.java.shop;

public class Prodotto {
	private String code;
	private String name;
	private String brand;
	private double price; 
	private float iva;
	
	public Prodotto(String name, String brand,double price, float iva) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.iva = iva;
		
	}
	
	// Code
	public String getCode() {
		return code;
	}
	
	
	// Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	// Brand
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	// Price
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	// Iva
	public void setIva(float iva) {
		this.iva = iva;
	}
	
	public float getIva() {
		return iva;
	}
	
	
}
