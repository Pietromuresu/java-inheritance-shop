package org.java.shop;

public class Prodotto {
	private String code;
	private String name;
	private String brand;
	private double price; 
	private float iva;
	
	public Prodotto(String name, String brand,double price, float iva) {
		setName(name);
		setBrand(brand);
		setPrice(price);
		setIva(iva);
		
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
	
	public String getIva() {
		return String.format("%.02f", iva);
	}
	
	
	// Prezzo con Iva
	public double getTotalPrice() {
		return getPrice() + (getPrice() * (iva / 100));
	}
	
	public double discountedPrice() {
		return getTotalPrice() - (getTotalPrice() * (2 / 100));
	}
	
	@Override
	public String toString() {
		return "Prodotto: " + getName() + " | Brand: " + getBrand() + " | Prezzo Vendita: " + String.format("%.02f", getTotalPrice()) + "$  | Prezzo(no Tax): " + getPrice() + "$"; 
	}
	
}
