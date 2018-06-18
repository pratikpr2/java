package com.bridgelabz.factoryDesign.model;

public class PersonalComputer implements Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PersonalComputer(String ram,String hdd,String cpu) {
		// TODO Auto-generated constructor stub
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
