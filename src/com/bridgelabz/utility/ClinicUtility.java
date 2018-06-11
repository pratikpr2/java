package com.bridgelabz.utility;

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

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class ClinicUtility {
	
	static Object obj;
	static ObjectMapper mapper=new ObjectMapper();
	static Scanner scanner = new Scanner(System.in);
	
	public static String userStringInput() {
		String string = scanner.nextLine();
		return string;
	}

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
	
	public static String getName() {
		System.out.println("Enter Name");
		return userStringInput();
	}

	public static int getId() {
		System.out.println("Enter Id");
		return userIntegerInput();
	}
	
	public static String availabilty() {
		System.out.println("Enter The Availabilty Details");
		return userStringInput();
	}
	
	public static String getPhoneNumber() {
		System.out.println("Enter the Contact Number");
		return userStringInput();
	}
	
	public static int getAge() {
		System.out.println("Enter the age");
		return userIntegerInput();
	}

	public static List<Patient> readPatientFromjson() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Patient> patientList = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/patient.json"));
		JSONArray array = (JSONArray) obj;
		for(Object object: array) {
			Patient patient = new Patient();
			JSONObject getPatient = (JSONObject)object;
			patient.setName(getPatient.get("name").toString());
			patient.setId(Integer.parseInt(getPatient.get("id").toString()));
			patient.setAge(Integer.parseInt(getPatient.get("age").toString()));
			patient.setPhoneNumber(getPatient.get("phoneNumber").toString());
		
			patientList.add(patient);
		}
		return patientList;
		
	}
	public static List<Doctor> readDoctorFromjson() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/doctor.json"));
		JSONArray array = (JSONArray) obj;
		for(Object object: array) {
			Doctor doctor = new Doctor();
			JSONObject getDoctor = (JSONObject)object;
			doctor.setName(getDoctor.get("name").toString());
			doctor.setId(Integer.parseInt(getDoctor.get("id").toString()));
			doctor.setSpecialization(getDoctor.get("specialization").toString());
			doctor.setAvailable(getDoctor.get("available").toString());
			doctor.setPatientCount(Integer.parseInt(getDoctor.get("patientCount").toString()));
			doctorList.add(doctor);
		}
		return doctorList;
		
	}

	public static String getSpecializaton() {
		// TODO Auto-generated method stub
		System.out.println("Please Set Doctors' Specialization");
		return userStringInput();
	}

	public static int getPatientCount() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Patient Count");
		return userIntegerInput();
	}

	public static void saveDoctorList(List<Doctor> doctorList) throws IOException, JsonMappingException {
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/doctor.json"), doctorList);

	}
	public static void savePatientList(List<Patient> patientList) throws IOException, JsonMappingException {
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/patient.json"), patientList);

	}
	

	public static String getAvailability() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Availabilty Time");
		return userStringInput();
	}

	public static List<Appointment> readAppointmentFromJson() throws IOException, ParseException {
		// TODO Auto-generated method stub
		List<Appointment> appointmentList = new LinkedList<>();
		obj = new JSONParser().parse(new FileReader("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/appointment.json"));
		JSONArray array = (JSONArray) obj;
		for(Object object: array) {
			Appointment appmnt = new Appointment();
			JSONObject getAppntmnet = (JSONObject)object;
			appmnt.setDoctorName(getAppntmnet.get("doctorName").toString());
			appmnt.setDoctorId(Integer.parseInt(getAppntmnet.get("doctorId").toString()));
			appmnt.setPatientName(getAppntmnet.get("patientName").toString());
			appmnt.setPatientId(Integer.parseInt(getAppntmnet.get("patientId").toString()));
			appmnt.setTimeStamp(getAppntmnet.get("timeStamp").toString());
		
			appointmentList.add(appmnt);
		}
		return appointmentList;
	}

	public static void saveAppointmentList(List<Appointment> appointmentList) throws JsonGenerationException, IOException {
		// TODO Auto-generated method stub
		mapper.writeValue(new File("/home/bridgelabz/mycodes/ClinicMangementSystem/src/com/bridgelabz/files/appointment.json"), appointmentList);

	}
	
	public static String getTimeStamp() {
		SimpleDateFormat sdfDate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
}
