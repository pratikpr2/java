package com.bridgelabz.objectprograms.addressbook;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class UserMain {
	
	static int option;
	public static void main(String[] args) throws IOException, ParseException {
		
		System.out.println("Welcome to Address Book");
		AddressBookManager manager= new AddressBookManager();
		manager.createNewAddresBook();
		
		while(option!=7) {
			System.out.println("Enter the proper Choices to Continue...");
			System.out.println("1:Add Person   2:Delete Person");
			System.out.println("3:Edit Contact 4:ShowAddressBook");
			System.out.println("5:Save         6:SortBy FirstName");
			System.out.println("         7:Exit");
			option=Utility.userIntegerInput();
			Utility.userStringInput();
			switch(option) {
			case 1:
				manager.addPerson();
				break;
			
			case 2:
				manager.deletePerson();
				break;
				
			case 3:
				manager.editPersonDetails();
				break;
			case 4:
				manager.showAddressBook();
				break;
			case 5:
				manager.save();
				break;
			case 6:
				manager.sortbyFirstName();
				break;
			default:
				System.out.println("Exiting AddressBook");
			}
		}
	}
	
}
