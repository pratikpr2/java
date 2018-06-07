package com.bridgelabz.objectprograms;

import java.io.FileReader;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventory {

	public static void main(String[] args) throws Exception {
		
		Object obj = new JSONParser().parse(new FileReader("inventory.json"));
		JSONObject jsonObj=(JSONObject) obj;
		
		@SuppressWarnings("unchecked")
		Set<String> keys=jsonObj.keySet();
		
		for(String inventoryArrayKey : keys) {
			JSONArray inventoryArray = (JSONArray)jsonObj.get(inventoryArrayKey);
			long totalPrice=0;
			for(Object object:inventoryArray) {
				JSONObject inventory = (JSONObject) object;
				long weight =(long)inventory.get("weight");
				long price = (long)inventory.get("price");
				totalPrice+=(weight * price);
			}
			System.out.println("Inventory Price of "+ inventoryArrayKey +" is: "+totalPrice );
		}
		
	}
}
