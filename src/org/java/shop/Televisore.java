package org.java.shop;

public class Televisore extends Prodotto{
	
	private int dimensions;
	private boolean smartTv;

	public Televisore(String name, String brand, double price, float iva, int dimensions, boolean isSmart) {
		
		super(name, brand, price, iva);
		setSmartTv(isSmart);
		setDimensions(dimensions);
	}
	
	// Dimensioni
	public int getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(int dimensions) {
		if(dimensions > 0)
			this.dimensions = dimensions;
	}
	
	// Smart Tv o NO 
	public void setSmartTv(boolean isSmart) {
		
		this.smartTv = isSmart;
	}
	
	public boolean isSmart() {
		
		return smartTv;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto: " + getName() + " | Brand: " + getBrand() + " | Dimensioni: " + getDimensions() + "'' | Smart Tv: " + (isSmart() ? "Si" : "No") + " | Prezzo Vendita: " + String.format("%.02f", getTotalPrice()) + "$  | Prezzo(no Tax): " + getPrice() + "$";
	}
}
