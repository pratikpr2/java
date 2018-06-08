/******************************************************************************
 *  
 *  Purpose: To Generate all Utility functions for managing AddressBook
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   08-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.objectprograms.addressbook;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBookUtility {
	//Static Objects are declared here
	
	static ObjectMapper mapper = new ObjectMapper();
	static Object obj;
	static File file = new File("/home/bridgelabz/mycodes/javaPrograms");
	
	
	/**
	 * Method to save a file to json
	 * 
	 * @param list is the linked list of Person object
	 * @param filename is the json file to save list
	 * @throws IOException to catch if file not found
	 */
	
	public static void saveToJson(List<Person> list,String filename) throws IOException{
		mapper.writeValue(new File(filename+".json"),list);
	}
	
	/**Method to read objects from a json file
	 * 
	 * @param filename is the json file to read from
	 * @return the list of objects
	 * @throws IOException
	 * @throws ParseException
	 */
	public static List<Person> readFromJson(String filename) throws IOException, ParseException{
		List<Person> list = new LinkedList<>();
		Person person = new Person();
		obj=new JSONParser().parse(new FileReader(filename+".json"));
		JSONArray addressarray = (JSONArray) obj;
		for(Object object:addressarray) {
			JSONObject getPerson = (JSONObject) object;
			person.setFirstName(getPerson.get("firstName").toString());
			person.setLastName(getPerson.get("lastName").toString());
			person.setAddress(getPerson.get("address").toString());
			person.setCity(getPerson.get("city").toString());
			person.setState(getPerson.get("state").toString());
			person.setZip(getPerson.get("zip").toString());
			person.setPhoneNumber(getPerson.get("phoneNumber").toString());
			list.add(person);
		}
		return list;
	}
	
	/**Method to delete an address from an addressBook
	 * @param Id takes a person id to delete
	 * @param filename is the file to delete from
	 * @return the list of person object
	 * @throws IOException
	 * @throws ParseException
	 */
	public static List<Person> deleteAddress(String Id,String filename) throws IOException, ParseException {
		List<Person> list = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader(filename+".json"));
		JSONArray addressArray = (JSONArray) obj;
		Person person = new Person();
		for(Object object: addressArray) {
			JSONObject getPerson = (JSONObject) object;
			if(!getPerson.get("firstName").toString().equalsIgnoreCase(Id)) {
				person.setFirstName(getPerson.get("firstName").toString());
				person.setLastName(getPerson.get("lastName").toString());
				person.setAddress(getPerson.get("address").toString());
				person.setCity(getPerson.get("city").toString());
				person.setState(getPerson.get("state").toString());
				person.setZip(getPerson.get("zip").toString());
				person.setPhoneNumber(getPerson.get("phoneNumber").toString());
				
				list.add(person);
			}
		}
		return list;
	}
	
	
	/**Method to take the firstName of Person
	 * @return the String of firstName
	 */
	public static String setFirstName() {
		System.out.println("Enter First Name");
		return Utility.userStringInput();
	}
	
	/**Method to take the lastName of Person
	 * @return the String of lastName
	 */
	public static String setLastName() {
		System.out.println("Enter Last Name");
		return Utility.userStringInput();
	}
	/**Method to take the address of Person
	 * @return the String of address
	 */
	public static String setAddress() {
		System.out.println("Enter the Address");
		return Utility.userStringInput();
	}
	/**Method to take the name of Person to delete
	 * @return String of the name
	 */
	public static String setdeleteAddress() {
		System.out.println("Enter firstName to delete an Entry");
		String phoneNumber=Utility.userStringInput();
		return phoneNumber;
	}
	/**Method to take the city name of Person
	 * @return the String of city name
	 */
	public static String setCity() {
		System.out.println("Enter the City");
		return Utility.userStringInput();
	}
	/**Method to take the state name of Person
	 * @return the String of state name
	 */
	public static String setState() {
		System.out.println("Enter the state");
		return Utility.userStringInput();
	}
	/**Method to take the zipCode of Person
	 * @return the String of zipCode
	 */
	public static String setZip() {
		System.out.println("Enter the Zip");
		return Utility.userStringInput();
	}
	/**Method to take the phoneNumber of the Person
	 * @return the String of phoneNumber
	 */
	public static String setPhoneNumber() {
		System.out.println("Enter the Phone Number");
		return Utility.userStringInput();
	}

	/**Method to print all the Person details in the AddressBook  
	 * @param filename takes the addressBook file
	 */
	public static void printAddressBook(String filename) {
		try {
			obj = new JSONParser().parse(new FileReader(filename+".json"));
			JSONArray addressarray=(JSONArray)obj;
			int i=1;
			for(Object object:addressarray) {
				JSONObject person = (JSONObject) object;
				System.out.println(i+ " "+ person.get("firstName")+" "+ person.get("lastName"));
				i++;
			} 
		}
			catch (Exception e) {
			System.out.println("Address Book Empty");
			}
		
		
	}

	/**Method to Edit a Person details by the serialId
	 * @param Id takes the serial number
	 * @param filename takes the addressBook file
	 * @return the list of Person object
	 * @throws IOException
	 * @throws ParseException
	 */
	public static List<Person> editPerson(int Id,String filename) throws IOException, ParseException {
		obj = new JSONParser().parse(new FileReader(filename+".json"));
		List<Person> list = new LinkedList<>();
		JSONArray addressArray = (JSONArray)obj;
		
		int i=1;
		for(Object object:addressArray) {
			JSONObject personArray = (JSONObject) object;
			if(i==Id) {
				Person person = new Person();
				person.setFirstName(personArray.get("firstName").toString());
				Utility.userStringInput();
				person.setLastName(personArray.get("lastName").toString());
				System.out.println("Edit details for " +person.getFirstName()+" "+person.getLastName() );
				person.setAddress(setAddress());
				person.setCity(setCity());
				person.setState(setState());
				person.setZip(setZip());
				person.setPhoneNumber(setPhoneNumber());
				list.add(person);
			}
			else {	
				Person person = new Person();
				person.setFirstName(personArray.get("firstName").toString());
				person.setLastName(personArray.get("lastName").toString());
				person.setAddress(personArray.get("address").toString());
				person.setCity(personArray.get("city").toString());
				person.setState(personArray.get("city").toString());
				person.setZip(personArray.get("zip").toString());
				person.setPhoneNumber(personArray.get("phoneNumber").toString());
				list.add(person);
			}
			i++;
		}
		return list;
	}

	/**Method to take the Person id to edit details
	 * @return the unique serial number
	 */
	public static int editPersonId() {
		System.out.println("Enter the serial Number to edit the Person details");
		int Id = Utility.userIntegerInput();
		return Id;
	}

	/**Method to sort the Person In an AddressBook By firstName
	 * @param filename reads the addressBook file to sort
	 * @return the List of sorted Person
	 * @throws IOException
	 * @throws ParseException
	 */
	public static List<Person> sortbyFirstName(String filename) throws IOException, ParseException {
		obj = new JSONParser().parse(new FileReader(filename+".json"));
		JSONArray addressArray = (JSONArray) obj;
		List<Person> list= new LinkedList<>();
		for(int i=0;i<addressArray.size()-1;i++) {
			for(int j =0;j<addressArray.size()-i-1;j++) {
				JSONObject person = (JSONObject)addressArray.get(j);
				JSONObject person2=(JSONObject)addressArray.get(j+1);
				if(person.get("firstName").toString().compareToIgnoreCase(person2.get("firstName").toString())>0){
					JSONObject temp = person;
					addressArray.set(j, person2);
					addressArray.set(j+1, temp);
				}
			}
		}
		for(Object object:addressArray) {
			Person person = new Person();
			JSONObject getPerson = (JSONObject) object;
			person.setFirstName(getPerson.get("firstName").toString());
			person.setLastName(getPerson.get("lastName").toString());
			person.setAddress(getPerson.get("address").toString());
			person.setCity(getPerson.get("city").toString());
			person.setState(getPerson.get("state").toString());
			person.setZip(getPerson.get("zip").toString());
			person.setPhoneNumber(getPerson.get("phoneNumber").toString());
			list.add(person);
		}
		return list;
	}

	/**Method to getFileName from User to save AddressBook data
	 * @return the String of fileName
	 */
	public static String getFileName() {
		System.out.println("Enter the file name for your addressBook");
		return Utility.userStringInput();
	}

	/**Method to set the FileName for An AddressBook to store data
	 * @param filename takes the fileName
	 * @throws IOException
	 */
	public static void setFileName(String filename) throws IOException {
		String fileName = filename+".json";
		File file = new File("/home/bridgelabz/mycodes/javaPrograms/"+fileName);
		if((file.createNewFile())) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exists");
		}
	}
	/**Method to search a particular file
	 * @param filename takes the file to search
	 * @param file checks the directory to search
	 * @return the file searched
	 */
	public static File getFile(String filename,File file) {
		
		File[] list = file.listFiles();
		if(list!=null)
		for(File fil:list) {
			if(fil.isDirectory()) {
				getFile(filename,fil);
			}
			else if(filename.equalsIgnoreCase(fil.getName())) {
				return fil.getParentFile();
			}
		}
		System.out.println("File Not Found");
		return null;
	}

	/*public static List<Person> addPersonDetails() {
		List<Person> list = new LinkedList<>();
		
		Person person = new Person();
		person.setFirstName(setFirstName());
		person.setLastName(setLastName());
		person.setAddress(setAddress());
		person.setCity(setCity());
		person.setState(setState());
		person.setZip(setZip());
		person.setPhoneNumber(setPhoneNumber());
		
		list.add(person);
		
		return list;
	}*/
}
