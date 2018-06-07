package com.bridgelabz.objectprograms;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {
	
	public static void main(String[] args) {
		JSONParser parser= new JSONParser();
		/*try {
			Object obj= parser.parse(new FileReader("stock.json"));
			JSONObject jsonobj = (JSONObject)obj;
			
			JSONArray stockName= (JSONArray)jsonobj.get("StockName");
			for(int i=0;i<stockName.size();i++) {
				
			}
		}*/
	}
}
