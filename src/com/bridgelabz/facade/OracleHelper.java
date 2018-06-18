package com.bridgelabz.facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection() {
		//get Oracle Connection
		System.out.println("Oracle Connection Established");
		return null;
	}
	public void generateOraclePDFReport(String tableName,Connection con) {
		//get data from table
		System.out.println("Some data from Table");
	}
	public void generateOracleHTMLReport(String tableName,Connection con) {
		//get data from Html
		System.out.println("Some data from Html");
	}
}
