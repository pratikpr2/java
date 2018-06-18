package com.bridgelabz.factory;

import com.bridgelabz.factoryDesign.model.Computer;
import com.bridgelabz.factoryDesign.model.PersonalComputer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerType type,String ram,String hdd,String cpu) {
		
		Computer comp=null;
		
		switch(type) {
		case PersonalComputer:
			comp = new PersonalComputer(ram, hdd, cpu);
			break;
		case Server:
			comp = new PersonalComputer(ram, hdd, cpu);
			break;
			
		case Laptop:
			comp = new PersonalComputer(ram, hdd, cpu);
			break;
		}
		
		return comp;
	}
	
}
