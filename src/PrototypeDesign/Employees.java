package PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	private List<String> empList;
	
	public Employees() {
		empList= new ArrayList<>();
	}
	
	public Employees(List<String> list) {
		this.empList=list;
	}
	
	public void loadData() {
		empList.add("Don");
		empList.add("Mike");
		empList.add("Raph");
		empList.add("Leo");
	}
	
	public List<String> getEmplist(){
		return empList;
	}
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<>();
		for(String s:this.getEmplist()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees)emps.clone();
		Employees empsNew1 = (Employees)emps.clone();
		List<String> list = empsNew.getEmplist();
		list.add("John");
		List<String> list1 = empsNew1.getEmplist();
		list1.remove("Raph");
		
		System.out.println("emps List: "+emps.empList);
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
	
}
