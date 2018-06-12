package com.bridgelabz.manger;

import java.io.IOException;

import com.bridgelabz.serviceImplement.ManagerServiceImplement;
import com.bridgelabz.stockUtility.StockUtility;

public class StockManager {

	static int option;
	static ManagerServiceImplement manager;
	
	public static void main(String[] args) throws IOException {
		
		manager = new ManagerServiceImplement();
	
		while(option != 9) {
			System.out.println("****************************");
			System.out.println("  Welcome To Stock Manager");
			System.out.println("****************************");
			System.out.println("              MENU");
			System.out.println("  STOCK        ||  CUSTOMER");
			System.out.println("1: ADD         || 2: ADD ");
			System.out.println("3: DELETE      || 4: DELETE");
			System.out.println("5: SHOW DETAILS|| 6: SHOW DETAILS ");
			System.out.println("7: SAVE CHANGES|| 8: DO TRANSACTION");
			System.out.println("           9: EXIT");
			System.out.println("****************************");
			option = StockUtility.userIntegerInput();
			switch(option) {
			case 1:
				manager.addStocks();
				break;
			case 2:
				manager.addCustomers();
				break;
			case 3: 
				manager.deleteStocks();
				break;
			case 4:
				manager.deleteCustomers();
				break;
			case 5:
				manager.showStockDetails();
				break;
			case 6:
				manager.showCustomerDetails();
				break;
			case 7:
				manager.save();
				break;
			case 8:
				transaction();
				break;
			case 9:
				System.out.println("EXITING PROGRAM !");
				break;
			default:
				System.out.println("INVALID INPUT !");
			}
		}
	}

	private static void transaction() throws IOException {
		// TODO Auto-generated method stub
		int option1= 0;
		while(option1!=6) {
			System.out.println("******************");
			System.out.println(" TRANSACTION MENU");
			System.out.println("******************");
			System.out.println("1: BUY   || 2: SELL");
			System.out.println("3: SHOW TRANSACTION REPORT");
			System.out.println("4: SHOW STOCK REPORT");
			System.out.println("5: SAVE  || 6: EXIT");
			System.out.println("*******************");
			
			option1=StockUtility.userIntegerInput();
			switch(option1) {
			case 1:
				manager.buyStock();
				break;
			case 2:
				manager.sellStock();
				break;
			case 3:
				manager.showTransactionReport();
				break;
			case 4:
				manager.printReport();
				break;
			case 5:
				manager.save();
				break;
			case 6:
				System.out.println("EXITING TRANSACTION MENU !");
				break;
			default:
				System.out.println("INVALID INPUT");
			}
		}

	}
}