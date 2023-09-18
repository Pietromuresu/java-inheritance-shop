package org.java.shop;

public class Smartphone  extends Prodotto{
	private String imei;
	private int memory;
	
	
	public Smartphone(String name, String brand, double price, float iva, String imei, int memory) {
		
		super(name, brand, price, iva);
		setImei(imei);
		setMemory(memory);

	}
	
	// Imei
	public String getImei() {
		
		return this.imei;
	}
	
	public void setImei(String imei) {
		
		this.imei = imei;
	}
	
	// Memoria
	public int getMemory() {
		
		return this.memory;
	}
	
	public void setMemory(int memory) {
		
		if(memory > 0) {
			this.memory = memory;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto: " + getName() + " | Brand: " + getBrand() + " | Memoria: " + getMemory() + "GB | IMEI: " + getImei() + " | Prezzo Vendita: " + String.format("%.02f", getTotalPrice()) + "$  | Prezzo(no Tax): " + getPrice() + "$";
	}
}
