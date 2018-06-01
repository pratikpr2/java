package com.bridgelabz.objectprograms;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventory {
	static int ricetotalWeight;
	static int pulsetotalWeight;
	static int wheattotalWeight;
	public static void main(String[] args) {
		JSONParser parser= new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("inventory.json"));
			JSONObject jsonObj= (JSONObject) obj;
			
			JSONArray rice = (JSONArray) jsonObj.get("rice");
			for(int i=0;i<rice.size();i++) {
				JSONObject r1= (JSONObject)rice.get(i);
				ricetotalWeight+=Integer.parseInt(r1.get("weight").toString());
				System.out.println(r1);
			}
			System.out.println(ricetotalWeight);
			
			JSONArray pulse = (JSONArray) jsonObj.get("pulses");
			for(int i=0;i<pulse.size();i++) {
				JSONObject p=(JSONObject)pulse.get(i);
				pulsetotalWeight+=Integer.parseInt(p.get("weight").toString());
			}
			System.out.println(pulsetotalWeight);
			
			JSONArray wheat =(JSONArray) jsonObj.get("wheat");
			for(int i=0;i<wheat.size();i++) {
				JSONObject w=(JSONObject)wheat.get(i);
				wheattotalWeight+=Integer.parseInt(w.get("weight").toString());
			}
			System.out.println(wheattotalWeight);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
