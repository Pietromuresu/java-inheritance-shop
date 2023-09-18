package org.java.shop;

public class Televisore extends Prodotto{
	
	private int dimensions;
	private boolean smartTv;

	public Televisore(String name, String brand, double price, float iva, int dimensions, boolean isSmart) {
		
		super(name, brand, price, iva);
		setSmartTv(isSmart);
		setDimensions(dimensions);
	}
	
	public int getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(int dimensions) {
		if(dimensions > 0)
			this.dimensions = dimensions;
	}
	
	public void setSmartTv(boolean isSmart) {
		
		this.smartTv = isSmart;
	}
	
	public boolean isSmart() {
		
		return smartTv;
	}
}
