package com.navin.Telusko;

public class Tyre
{
	private String brand;
	private int height;
	

	public Tyre(String brand,int height) {
		super();
		this.brand = brand;
		this.height= height;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height=height;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
}
