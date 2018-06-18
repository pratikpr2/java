package com.bridgelabz.facade;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		//get MySqlDBConnection
		System.out.println("MySQL Connection Established");
		return null;
	}
	public void generateMySqlPDFReport(String tablename,Connection con) {
		//get Data From Table
		System.out.println("Some data From Table");
	}
	public void generateMySqlHTMLReport(String tableName,Connection con) {
		//get data from html
		System.out.println("Some data from Html");
	}
}
