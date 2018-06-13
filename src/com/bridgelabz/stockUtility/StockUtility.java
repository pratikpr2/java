/******************************************************************************
 *  
 *  Purpose: A Utility Class To Support Stock Manager functions
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.stockUtility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.Transaction;
import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;

public class StockUtility {

	static Object obj;
	static ObjectMapper mapper = new ObjectMapper();
	static Scanner scanner = new Scanner(System.in);
	static int i;
	
	/**
	 * @return an integer input
	 */
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
	
	/**
	 * @return a string input
	 */
	public static String userStringInput() {
		String string = scanner.nextLine();
		return string;
	}
	
	/**
	 * @return the stock Name input
	 */
	public static String getStockName() {
		System.out.println("Enter stock Name: ");
		return userStringInput();
	}
	/**
	 * @return the number of stock input
	 */
	public static int getNumberofStocks() {
		System.out.println("Enter the Number of stocks");
		return userIntegerInput();
	}
	/**
	 * @return the stock value input
	 */
	public static int getStockValue() {
		System.out.println("Enter the stock Value");
		return userIntegerInput();
	}
	/**
	 * @return the first name input
	 */
	public static String getFirstName() {
		System.out.println("Enter the First Name");
		return userStringInput();
	}
	/**
	 * @return the last name input
	 */
	public static String getLastName() {
		System.out.println("Enter the Last Name");
		return userStringInput();
	}
	/**
	 * @return the phone number input
	 */
	public static String getphoneNumber() {
		System.out.println("Enter Contact Number");
		return userStringInput();
	}

	/**
	 * @return the stockList from stock json file
	 * @throws IOException
	 * @throws ParseException
	 */
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

	/**
	 * @return the customer List from customer json file
	 * @throws IOException
	 * @throws ParseException
	 */
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

	/**
	 * @return the transaction list from transaction json file
	 * @throws IOException
	 * @throws ParseException
	 */
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

	/**
	 * @param customerList to add customer list to customer json file
	 * @throws IOException
	 * @throws JsonMappingException
	 */
	public static void saveCustomerList(List<Customer> customerList) throws IOException, JsonMappingException{
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/customer.json"), customerList);
	}

	/**
	 * @param stockList to add stock list to stock json file
	 * @throws IOException
	 * @throws JsonMappingException
	 */
	public static void saveStockList(List<Stock> stockList) throws IOException, JsonMappingException{
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/stock.json"), stockList);

	}
	/**
	 * @return the generated timestamp from the system
	 */
	public static String getTimeStamp() {
		SimpleDateFormat sdfDate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	/**
	 * @param transactionList to add transaction list to transaction json file
	 * @throws IOException
	 * @throws JsonMappingException
	 */
	public static void saveTransactionList(List<Transaction> transactionList) throws IOException, JsonMappingException {
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/stockManagementSystem/src/com/bridgelabz/files/transaction.json"), transactionList);

	}
	
	
}