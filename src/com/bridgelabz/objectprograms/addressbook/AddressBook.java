/******************************************************************************
 *  
 *  Purpose: To create an AddressBook type Class 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   08-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.objectprograms.addressbook;

import java.util.List;

public class AddressBook {

	private List<Person> persons;

	private String fileName;

	public AddressBook() {
		System.out.println("Address Book Created");
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
