package com.bridgelabz.objectprograms.inventory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class InventoryMain {
	
	public static void main(String[] args) throws IOException{
		
	//	Inventory products = getProducts();
		Map<String, List<Product>> list1 = new HashMap<>();
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Enter the number of Inventory Types");
		int inventoryNumber = Utility.userIntegerInput();
			
		while(inventoryNumber>0) {	
			Utility.userStringInput();
			System.out.println("Enter the Type");
			String inventorytype = Utility.userStringInput();
			List<Product> product = new ArrayList<Product>();
			
			System.out.println("Enter the number of elements for Type "+inventorytype);
			int numberOfitem = Utility.userIntegerInput();
			
			
			while(numberOfitem>0) {
				Product item = new Product();
				
				System.out.println("Enter The Name of "+ inventorytype);
				Utility.userStringInput();
				item.setName(Utility.userStringInput());
				
				System.out.println("Enter The weight of "+ inventorytype);
				item.setWeight(Utility.userIntegerInput());
			
				System.out.println("Enter The price of "+ inventorytype);
				item.setPrice(Utility.userIntegerInput());
	
				
				product.add(item);
				numberOfitem--;
			}
			list1.put(inventorytype, product);
				
			inventoryNumber--;
		}
				
			mapper.writeValue(new File("inventory.json"),list1);
		}
	}

		


