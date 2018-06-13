/******************************************************************************
 *  
 *  Purpose: To Implement Manager Services methods
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.serviceImplement;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.Transaction;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.stockUtility.StockUtility;

public class ManagerServiceImplement implements ManagerService {

	private List<Stock> stockList;
	private List<Customer> customerList;
	private List<Transaction> transactionList;
	List<String> stackList=new Stack<>();
	Queue<String> queList = new LinkedList<>();
	CustomerServiceImplement customerService;
	StockServiceImplement stockService;
	
	public ManagerServiceImplement() {
		// TODO Auto-generated constructor stub
		try {
			stockList = StockUtility.readstockList();
			customerList = StockUtility.readCustomerList();
			transactionList = StockUtility.readTransactionList();
		}catch(Exception e) {
			stockList = new LinkedList<>();
			customerList=new LinkedList<>();
			transactionList= new LinkedList<>();
		}
		customerService = new CustomerServiceImplement();
		stockService = new StockServiceImplement();
	}
	
	@Override
	public void addStocks() {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
		StockUtility.userStringInput();
		stock.setStockName(StockUtility.getStockName());
		stock.setStockValue(StockUtility.getStockValue());
		stock.setNumberOfStocks(StockUtility.getNumberofStocks());
		System.out.println("ENTRY ADDED SUCCESSFULLY !");
		System.out.println("CLICK SAVE TO CONTINUE");
		
		stockList.add(stock);
	}

	@Override
	public void addCustomers() {
		// TODO Auto-generated method stub
		StockUtility.userStringInput();
		Customer customer = new Customer();
		customer.setFirstName(StockUtility.getFirstName());
		customer.setLastName(StockUtility.getLastName());
		customer.setId(customerList.size()+1);
		customer.setPhoneNumber(StockUtility.getphoneNumber());
		
		System.out.println("ENTRY ADDED SUCCESSFULLY !");
		System.out.println("CLICK SAVE TO CONTINUE");
		
		customerList.add(customer);
	}

	@Override
	public void deleteStocks() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of Stock to delete");
		String stockName = StockUtility.userStringInput();
		for(int i=0;i<stockList.size();i++) {
			if(stockList.get(i).getStockName().equals(stockName)) {
				stockList.remove(i);
				System.out.println("Entry Added to delete");
				System.out.println("Click Save to Confirm");
				return;
			}
		}System.out.println("Entry Not Found");
		
	}

	public void showCustomerDetails() {
		System.out.println("***************");
		System.out.println("Customers List");
		System.out.println("***************");
		customerService.showCustomers(customerList);
	}
	@Override
	public void deleteCustomers() {
		// TODO Auto-generated method stub
		System.out.println("Enter the First Name To delete a Customer");
		String firstName = StockUtility.userStringInput();
		for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getFirstName().equals(firstName)) {
				customerList.remove(i);
				System.out.println("Entry Added To Delete");
				System.out.println("Click Save To Confirm");
				return;
			}
		}System.out.println("Entry Not Found");
	}

	@Override
	public void buyStock() {
		// TODO Auto-generated method stub
		StockUtility.userStringInput();
		showStockDetails();
		boolean b=false;
		int index=0;
		int numberOfShares=0;
		System.out.println("Enter the First Name of the stock to buy");
		String stockName= StockUtility.userStringInput();
		System.out.println("Enter the Customer's First Name To Purchase for");
		String customerName=StockUtility.userStringInput();
		System.out.println("Enter Number of Stocks to buy");
		int numberOfStocks=StockUtility.userIntegerInput();
		Transaction transaction = new Transaction();
		for(int i=0;i<stockList.size();i++) {
			if(stockList.get(i).getStockName().equals(stockName)) {
				transaction.setStockName(stockList.get(i).getStockName());
				numberOfShares = stockList.get(i).getNumberOfStocks();
				index =i;
				b=true;
			}
		}
		for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getFirstName().equals(customerName) && b) {
				transaction.setCustomerFirstName(customerList.get(i).getFirstName());
				transaction.setCustomerLastName(customerList.get(i).getLastName());
				transaction.setStockBought(numberOfStocks);
				transaction.setTimeStamp(StockUtility.getTimeStamp());
				
				stockList.get(index).setNumberOfStocks(numberOfShares+numberOfStocks);
				stackList.add(stockList.get(index).getStockName());
				transactionList.add(transaction);
				System.out.println("Transaction SuccessFul !");
				return;
			}
		}System.out.println("Error ! Transaction Declined");
		 System.out.println("Enter Valid Input Or Try Again Later");
		
	}

	@Override
	public void sellStock() {
		// TODO Auto-generated method stub
		StockUtility.userStringInput();
		showCustomerDetails();
		System.out.println("Enter The Customer's First Name To Sell a Stock: ");
		String customerName= StockUtility.userStringInput();
		boolean b = false;
		String stockName="";
		int stockBought=0;
		for(int i=0;i<transactionList.size();i++) {
			if(transactionList.get(i).getCustomerFirstName().equals(customerName)) {
				stockName = transactionList.get(i).getStockName();
				stockBought =transactionList.get(i).getStockBought();
				transactionList.remove(i);
				b= true;
			}
		}
		if(b) {
			for(int i=0;i<stockList.size();i++) {
				if(stockList.get(i).getStockName().equals(stockName)) {
					stockList.get(i).setNumberOfStocks(stockList.get(i).getNumberOfStocks()-stockBought);
					stackList.add(stockName);
					System.out.println("Transaction SuccessFul !");
				}
			}
		}
		else {
			System.out.println("Transaction Declined !");
			System.out.println("Enter Valid Input or Try Again Later");
		}
		
		
	}

	public void showTransactionReport() {
		
		System.out.println("TRANSACTION REPORT");
		for(int i=0;i<transactionList.size();i++) {
			System.out.println("Stock Name:    "+transactionList.get(i).getStockName());
			System.out.println("Stocks Bought: "+transactionList.get(i).getStockBought());
			System.out.println("Customers First Name : "+transactionList.get(i).getCustomerFirstName());
			System.out.println("Customers Last Name  : "+transactionList.get(i).getCustomerLastName());
			System.out.println("TimeStamp : "+ transactionList.get(i).getTimeStamp());
		}
	}
	@Override
	public void save() throws IOException{
		StockUtility.saveCustomerList(customerList);
		StockUtility.saveStockList(stockList);
		StockUtility.saveTransactionList(transactionList);
		System.out.println("File Saved");
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		stockService.totalStockPrice(stockList);
		
	}
	
	public void showtransactionStack() {
		System.out.println("Last Purchased/Sold Stocks");
		for(int i=0;i<transactionList.size();i++) {
			stackList.add(transactionList.get(i).getStockName());
		}
		if(stackList!=null) {
			System.out.println("Stock Name :"+stackList);
			System.out.println("----------------------------");
		}
	}
	
	@Override
	public double valueOf() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void showStockDetails() {
		// TODO Auto-generated method stub
		System.out.println("***********");
		System.out.println("Stock List");
		System.out.println("***********");
		stockService.showStocks(stockList);
	}

	public void showtransactionQueue() {
		// TODO Auto-generated method stub
		System.out.println("Last Transaction Details");
		for(int i=0;i<transactionList.size();i++) {
			queList.add(transactionList.get(i).getTimeStamp());
		}
		if(queList!=null) {
			{
				System.out.println("TIMESTAMPS: "+queList);
				System.out.println("----------------------------");

			}
		}
	}

}
