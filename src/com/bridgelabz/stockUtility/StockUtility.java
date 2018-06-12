package com.bridgelabz.stockUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.Transaction;
import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.Transaction;

public class StockUtility {

	static Object obj;
	static ObjectMapper mapper = new ObjectMapper();
	static Scanner scanner = new Scanner(System.in);
	static int i;
	
	public static int userIntegerInput() {
		try {
			int number = scanner.nextInt();
			return number;
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid number, please try again...");
			return userIntegerInput();
		}

	}
	
	public static String userStringInput() {
		String string = scanner.nextLine();
		return string;
	}
	
	public static String getStockName() {
		System.out.println("Enter stock Name: ");
		return userStringInput();
	}
	public static int getNumberofStocks() {
		System.out.println("Enter the Number of stocks");
		return userIntegerInput();
	}
	public static int getStockValue() {
		System.out.println("Enter the stock Value");
		return userIntegerInput();
	}
	public static String getFirstName() {
		System.out.println("Enter the First Name");
		return userStringInput();
	}
	public static String getLastName() {
		System.out.println("Enter the Last Name");
		return userStringInput();
	}
	public static String getphoneNumber() {
		System.out.println("Enter Contact Number");
		return userStringInput();
	}

	public static List<Stock> readstockList() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Stock> list = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/stock.json"));
		JSONArray array = (JSONArray)obj;
		for(Object object: array) {
			Stock stock = new Stock();
			JSONObject getStock = (JSONObject) object;
			stock.setStockName(getStock.get("stockName").toString());
			stock.setStockValue(Integer.parseInt(getStock.get("stockValue").toString()));
			stock.setNumberOfStocks(Integer.parseInt(getStock.get("numberOfStocks").toString()));
			
			list.add(stock);
		}
		return list;
	}

	public static List<Customer> readCustomerList() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Customer> list = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/customer.json"));
		JSONArray array = (JSONArray)obj;
		for(Object object: array) {
			Customer customer = new Customer();
			JSONObject getCustomer = (JSONObject) object;
			customer.setFirstName(getCustomer.get("firstName").toString());
			customer.setLastName(getCustomer.get("lastName").toString());
			customer.setId(Integer.parseInt(getCustomer.get("id").toString()));
			customer.setPhoneNumber(getCustomer.get("phoneNumber").toString());
			
			list.add(customer);
		}
		return list;
	}

	public static List<Transaction> readTransactionList() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Transaction> list = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/transaction.json"));
		JSONArray array = (JSONArray)obj;
		for(Object object: array) {
			Transaction transaction = new Transaction();
			JSONObject gettransaction = (JSONObject) object;
			transaction.setStockName(gettransaction.get("stockName").toString());
			transaction.setStockBought(Integer.parseInt(gettransaction.get("stockBought").toString()));
			transaction.setCustomerFirstName(gettransaction.get("customerFirstName").toString());
			transaction.setCustomerLastName(gettransaction.get("customerLastName").toString());
			transaction.setTimeStamp(gettransaction.get("timeStamp").toString());
			list.add(transaction);
		}
		return list;
	}

	public static void saveCustomerList(List<Customer> customerList) throws IOException, JsonMappingException{
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/customer.json"), customerList);
	}

	public static void saveStockList(List<Stock> stockList) throws IOException, JsonMappingException{
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/stock.json"), stockList);

	}
	public static String getTimeStamp() {
		SimpleDateFormat sdfDate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static void saveTransactionList(List<Transaction> transactionList) throws IOException, JsonMappingException {
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/transaction.json"), transactionList);

	}
	
	
}