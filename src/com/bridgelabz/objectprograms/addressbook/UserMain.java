/******************************************************************************
 *  
 *  Purpose: To Generate a Main User Class to Interact With AddressBook
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   08-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.objectprograms.addressbook;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class UserMain {
	
	static int option;
	public static void main(String[] args) throws IOException, ParseException {
		
		System.out.println("Welcome to Address Book");
		AddressBookManager manager= new AddressBookManager();
		System.out.println();
		//USER MENU
		while(option!=8) {
			System.out.println("Enter the proper Choices to Continue...");
			System.out.println("1: OPEN/CREATE New AddressBook ");
			System.out.println("2: ADD a Person 3: DELETE a Person");
			System.out.println("4: EDIT Contact 5: SHOW AddressBook");
			System.out.println("6: SAVE         7: SORTBY FirstName");
			System.out.println("         8:Exit");
			option=Utility.userIntegerInput();
			Utility.userStringInput();
			switch(option) {
			case 1:
				manager.setFile();
				manager.createNewAddresBook();
				break;
			
			case 2:
				manager.addPerson();
				break;
				
			case 3:
				manager.deletePerson();
				break;
			case 4:
				manager.editPersonDetails();
				break;
			case 5:
				manager.showAddressBook();
				break;
			case 6:
				manager.save();
				break;
			case 7:
				manager.sortbyFirstName();
				break;
			default:
				System.out.println("Exiting AddressBook");
			}
		}
	}
	
}
