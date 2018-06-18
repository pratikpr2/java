package com.bridgelabz.factoryDesign.model;

public class Laptop implements Computer {


	private String ram;
	private String hdd;
	private String cpu;
	
	public Laptop(String ram,String hdd,String cpu) {
		// TODO Auto-generated constructor stub
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}
	
}
