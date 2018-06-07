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
	static ObjectMapper mapper = new ObjectMapper();
	static Object obj;
	
	public static void saveToJson(List<Person> list) throws IOException{
		mapper.writeValue(new File("addressBook.json"),list);
	}
	
	public static List<Person> readFromJson() throws IOException, ParseException{
		List<Person> list = new LinkedList<>();
		Person person = new Person();
		obj=new JSONParser().parse(new FileReader("addressBook.json"));
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
	public static List<Person> deleteAddress(String Id) throws IOException, ParseException {
		List<Person> list = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("addressBook.json"));
		JSONArray addressArray = (JSONArray) obj;
		Person person = new Person();
		for(Object object: addressArray) {
			JSONObject getPerson = (JSONObject) object;
			if(!getPerson.get("phoneNumber").toString().equals(Id)) {
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
	
	public static String setFirstName() {
		System.out.println("Enter First Name");
		return Utility.userStringInput();
	}
	
	public static String setLastName() {
		System.out.println("Enter Last Name");
		return Utility.userStringInput();
	}
	public static String setAddress() {
		System.out.println("Enter the Address");
		return Utility.userStringInput();
	}
	public static String setdeleteAddress() {
		System.out.println("Enter phone number to delete an Entry");
		String phoneNumber=Utility.userStringInput();
		return phoneNumber;
	}
	public static String setCity() {
		System.out.println("Enter the City");
		return Utility.userStringInput();
	}
	public static String setState() {
		System.out.println("Enter the state");
		return Utility.userStringInput();
	}
	public static String setZip() {
		System.out.println("Enter the Zip");
		return Utility.userStringInput();
	}
	public static String setPhoneNumber() {
		System.out.println("Enter the Phone Number");
		return Utility.userStringInput();
	}

	public static void printAddressBook() {
		try {
			obj = new JSONParser().parse(new FileReader("addressBook.json"));
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

	public static List<Person> editPerson(int Id) throws IOException, ParseException {
		obj = new JSONParser().parse(new FileReader("addressBook.json"));
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

	public static int editPersonId() {
		System.out.println("Enter the serial Number to edit the Person details");
		int Id = Utility.userIntegerInput();
		return Id;
	}

	public static List<Person> sortbyFirstName() throws IOException, ParseException {
		obj = new JSONParser().parse(new FileReader("addressBook.json"));
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
}
