package com.bridgelabz.facade;

public class FacadeTest {

	public static void main(String[] args) {
		String tableName= "tablename";
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,HelperFacade.ReportTypes.HTML, tableName);
		//HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,HelperFacade.ReportTypes.PDF, tableName);
		System.out.println();
		//HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportTypes.PDF, tableName);
	}
}
