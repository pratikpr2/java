package com.bridgelabz.objectprograms.addressbook;

import java.util.LinkedList;
import java.util.List;

public class AddressBook {

	List<AddressBook> list = new LinkedList<>();
	
	public AddressBook() {
		System.out.println("Address Book Created");
	}
	public Person add(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber){
		Person person = new Person();
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setZip(zip);
		person.setPhoneNumber(phoneNumber);
		
		return person;
		
	}
	/*public void delete(Person person) {
		list.remove(person);
	}
	public void sortByName() {
	
	}
	public void sortByZip() {
	
	}
	public void printAddressBook() {
		
	}
	public void addToList(AddressBook person) {
		list.add(person);
	}*/
}
