/******************************************************************************
 *  
 *  Purpose: To Generate an AddressBookManger class to manage AddressBook
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   08-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.objectprograms.addressbook;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.parser.ParseException;

public class AddressBookManager {
	
	List<Person> tempList;
	AddressBook book;
	String fileName;
	Person person;
	
	int addressBookId = 0;
	
	AddressBookManager(){
		System.out.println("Address Manager Initialised");
	}
	
	/**Method to check if addressBook is Empty
	 * @return boolean true/false
	 */
	public boolean isEmpty() {
		if (addressBookId==0) return true;
		return false;
	}
	
	/**
	 * Method to create and Initialize a new addressBook
	 */
	public void createNewAddresBook() {
		book=new AddressBook();
		openAddressBook();
	}
	
	/**
	 * Method to open an addressBook
	 */
	public void openAddressBook() {
		
			try {
				//tempList.clear();
				tempList = AddressBookUtility.readFromJson(fileName);
					
			}catch(Exception e) {
				tempList=new LinkedList<>();
				System.out.println("Unable to clear list");
			}
		
		

	}
	
	/**Method to set the fileName for an addressBook
	 * @throws IOException
	 */
	public void setFile() throws IOException {
		fileName = AddressBookUtility.getFileName();
		AddressBookUtility.setFileName(fileName);
		
	}
	
	/*public void getFile() {
		
	}*/
	
	/**Method to add a Person to the addressBook List
	 * @throws IOException
	 */
	public void addPerson() throws IOException {
		Person person = new Person();
		person.setFirstName(AddressBookUtility.setFirstName());
		person.setLastName(AddressBookUtility.setLastName());
		person.setAddress(AddressBookUtility.setAddress());
		person.setCity(AddressBookUtility.setCity());
		person.setState(AddressBookUtility.setState());
		person.setZip(AddressBookUtility.setZip());
		person.setPhoneNumber(AddressBookUtility.setPhoneNumber());
		
		tempList.add(person);
		
		System.out.println("Person added");
		System.out.println("Click save to continue");
	}
	
	/**Method to delete a Person from an AddressBook
	 * @throws IOException
	 * @throws ParseException
	 */
	public void deletePerson() throws IOException, ParseException {
		String deleteId = AddressBookUtility.setdeleteAddress();
		tempList = AddressBookUtility.deleteAddress(deleteId,fileName);
		System.out.println("Entry Added to Delete");
		System.out.println("Click save to Confirm");
	}
	
	/**Method to save data to an AddressBook
	 * @throws IOException
	 */
	public void save() throws IOException {
		AddressBookUtility.saveToJson(tempList,fileName);
		System.out.println("File saved");
	}
	/*public void saveAs(String name) {
		
	}*/

	/**Method to Show Persons in an AddressBook
	 * @throws IOException
	 * @throws ParseException
	 */
	public void showAddressBook() throws IOException, ParseException {
		AddressBookUtility.printAddressBook(fileName);
	}

	/**Method to Edit a Person Details
	 * @throws IOException
	 * @throws ParseException
	 */
	public void editPersonDetails() throws IOException, ParseException {
		int Id =AddressBookUtility.editPersonId();
		tempList=AddressBookUtility.editPerson(Id,fileName);
		System.out.println("Contact Edited");
		System.out.println("Click save to Confirm");
		
	}

	/**Method to Sort Persons in an addressBook by their FirstName
	 * @throws IOException
	 * @throws ParseException
	 */
	public void sortbyFirstName() throws IOException, ParseException {
		
		tempList=AddressBookUtility.sortbyFirstName(fileName);
		System.out.println("Contacts sorted By FirstName");
		System.out.println("Click Save to Confirm");
	}
	
}
