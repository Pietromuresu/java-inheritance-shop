package org.java.shop;

public class Cuffie extends Prodotto{
	
	private String color;
	private boolean isWireless;
	

	public Cuffie(String name, String brand, double price, float iva, String color, boolean isWireless) {
		
		super(name, brand, price, iva);
		setIsWireless(isWireless);
		setColor(color);
		
	}
	
	public void setColor(String color) {
	
		this.color = color;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void setIsWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	public boolean isWireless() {
		
		return isWireless;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto: " + getName() + " | Brand: " + getBrand() + " | Colore: " + getColor() + " | Wireless: " + (isWireless() ? "Si" : "No") + " | Prezzo Vendita: " + String.format("%.02f", getTotalPrice()) + "$  | Prezzo(no Tax): " + getPrice() + "$";
	}
}
