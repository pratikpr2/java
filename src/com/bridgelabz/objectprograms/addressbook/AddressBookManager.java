package com.bridgelabz.objectprograms.addressbook;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.parser.ParseException;

public class AddressBookManager {
	
	List<Person> tempList;
	AddressBook book;
	Person person;
	int addressBookId = 0;
	
	AddressBookManager(){
		System.out.println("Address Manager Initialised");
	}
	
	public boolean isEmpty() {
		if (addressBookId==0) return true;
		return false;
	}
	
	public void createNewAddresBook() {
		book=new AddressBook();
		openAddressBook();
	}
	
	public void openAddressBook() {
		if(tempList==null) {
			try {
				tempList = AddressBookUtility.readFromJson();
			}catch(Exception e) {
				System.out.println("AddressBook Empty");
				tempList=new LinkedList<>();
			}
		}
		

	}
	
	public void addPerson() throws IOException {
		String firstName=AddressBookUtility.setFirstName();
		String lastName=AddressBookUtility.setLastName();
		String address=AddressBookUtility.setAddress();
		String city = AddressBookUtility.setCity();
		String state=AddressBookUtility.setState();
		String zip = AddressBookUtility.setZip();
		String phoneNumber = AddressBookUtility.setPhoneNumber();
		person = book.add(firstName, lastName, address, city, state, zip, phoneNumber);
		
		tempList.add(person);
		addressBookId++;
		
		
		System.out.println("Person Added");
		System.out.println("Click save to Confirm");
		
	}
	
	public void deletePerson() throws IOException, ParseException {
		String deleteId = AddressBookUtility.setdeleteAddress();
		tempList = AddressBookUtility.deleteAddress(deleteId);
		System.out.println("Entry Added to Delete");
		System.out.println("Click save to Confirm");
	}
	
	public void save() throws IOException {
		AddressBookUtility.saveToJson(tempList);
		System.out.println("File saved");
	}
	public void saveAs(String name) {
		
	}

	public void showAddressBook() throws IOException, ParseException {
		AddressBookUtility.printAddressBook();
	}

	public void editPersonDetails() throws IOException, ParseException {
		int Id =AddressBookUtility.editPersonId();
		tempList=AddressBookUtility.editPerson(Id);
		System.out.println("Contact Edited");
		System.out.println("Click save to Confirm");
		
	}

	public void sortbyFirstName() throws IOException, ParseException {
		
		tempList=AddressBookUtility.sortbyFirstName();
		System.out.println("Contacts sorted By FirstName");
		System.out.println("Click Save to Confirm");
	}
	
}
