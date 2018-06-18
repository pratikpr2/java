package com.bridgelabz.factorytest;

import com.bridgelabz.factory.ComputerFactory;
import com.bridgelabz.factory.ComputerType;
import com.bridgelabz.factoryDesign.model.Computer;

public class FactoryTest {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.createComputer(ComputerType.PersonalComputer, "8GB", "500GB", "1.5GHZ");
		
		Computer laptop = ComputerFactory.createComputer(ComputerType.Laptop, "6GB", "500GB", "2GHZ");
		
		Computer server = ComputerFactory.createComputer(ComputerType.Server, "32GB", "1TB", "2.5GHZ");
		
		System.out.println("Factory Pc Config: "+pc.getRAM()+" "+pc.getHDD()+" "+pc.getCPU());
		System.out.println("Factory Laptop Config: "+laptop.getRAM()+" "+laptop.getHDD()+" "+laptop.getCPU());
		System.out.println("Factory Server Config: "+server.getRAM()+" "+ server.getHDD()+" "+server.getCPU());

	}
	
}
