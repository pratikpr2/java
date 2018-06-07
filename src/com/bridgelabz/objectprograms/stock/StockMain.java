package com.bridgelabz.objectprograms.stock;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockMain {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		List<Stocks> list = new ArrayList<>();
		ObjectMapper mapper= new ObjectMapper();
		
		System.out.println("Enter the number of Stocks");
		int numberOfStocks = Utility.userIntegerInput();
		
		while(numberOfStocks>0) {
			Stocks stock = new Stocks();
			System.out.println("Enter the name of stock");
			Utility.userStringInput();
			stock.setName(Utility.userStringInput());
			
			System.out.println("Enter the Number of share");
			stock.setNumberOfShares(Utility.userIntegerInput());
			
			System.out.println("Enter the Share Price");
			stock.setSharePrice(Utility.userIntegerInput());
			
			list.add(stock);
			
			numberOfStocks--;
		}
		
		mapper.writeValue(new File("stock.json"), list);
		
		Object obj = new JSONParser().parse(new FileReader("stock.json"));
		
		JSONArray stockArray = (JSONArray)obj;
		long totalSharePrice = 0;
		long price=0;
		for(Object object:stockArray) {
			JSONObject objelement= (JSONObject)object;
			long numberOfShares = (long)objelement.get("numberOfShares");
			long sharePrice = (long)objelement.get("sharePrice");
			totalSharePrice+=numberOfShares*sharePrice;
			price=numberOfShares*sharePrice;
			System.out.println("Share Price of :"+objelement.get("name")+" "+price);
		}
		System.out.println("Total Share Price :"+totalSharePrice);
	}
	
}	
