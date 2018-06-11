package com.bridgelabz.serviceImplimentation;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ManagerService;
import com.bridgelabz.utility.ClinicUtility;

public class ManagerServiceImplement implements ManagerService {

	private List<Patient> patientList ;
	private List<Doctor> doctorList ;
	private List<Appointment> appointmentList;
	DoctorServiceImplement docService;
	PatientServiceImplement patService;
	
	public ManagerServiceImplement() {
		// TODO Auto-generated constructor stub
		try {
			patientList=ClinicUtility.readPatientFromjson();
			doctorList=ClinicUtility.readDoctorFromjson();
			appointmentList=ClinicUtility.readAppointmentFromJson();
		}catch(Exception e) {
			patientList= new LinkedList<>();
			doctorList=new LinkedList<>();
			appointmentList=new LinkedList<>();
		}
		docService = new DoctorServiceImplement();
		patService = new PatientServiceImplement();
	}
	
	public void showDoctors() {
		docService.showDoctorDetails(doctorList);
	}
	public void showPatients() {
		patService.showPatientDetails(patientList);
	}
	public void searchDoctorsByKey() {
		System.out.println("Enter the proper Choices To Search: ");
		System.out.println("Search By: ?");
		System.out.println("1: Id             2: Name");
		System.out.println("3: Specialization 4: Availability");
		int option = ClinicUtility.userIntegerInput();
		switch(option) {
		case 1:
			docService.searchDoctorById(doctorList);
			break;
			
		case 2:
			docService.searchDoctorByName(doctorList);
			break;
		case 3:
			docService.searchDoctorBySpecialization(doctorList);
			break;
		case 4:
			docService.searchDoctorByAvailability(doctorList);
			break;
		default:
			System.out.println("Enter a proper Choice");
			
		}
	}
	
	public void searchPatientByKey() {
		System.out.println("Enter the proper Choices To Search: ");
		System.out.println("Search By: ?");
		System.out.println("1: Id             2: Name");
		System.out.println("3: Contact Number");
		int option = ClinicUtility.userIntegerInput();
		switch(option) {
		case 1:
			patService.searchPatientById(patientList);
			break;
			
		case 2:
			patService.searchPatientByName(patientList);
			break;
		case 3:
			patService.searchPatientByNumber(patientList);
			break;
		default:
			System.out.println("Enter a proper Choice");
			
		}
	}
	@Override
	public void addDoctor() {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.setName(ClinicUtility.getName());
		doctor.setId(ClinicUtility.getId());
		ClinicUtility.userStringInput();
		doctor.setSpecialization(ClinicUtility.getSpecializaton());
		doctor.setAvailable(ClinicUtility.getAvailability());
		doctor.setPatientCount(ClinicUtility.getPatientCount());
		
		doctorList.add(doctor);
		System.out.println("Doctor details added to the Entry");
		
	}

	@Override
	public void deleteDoctor() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of Doctor to delete from Entry");
		String name = ClinicUtility.userStringInput();
		for(int i =0;i<doctorList.size();i++) {
			if(doctorList.get(i).getName().equals(name)) {
				doctorList.remove(i);
				return;
			}
		}System.out.println("Entry not found");
		
	}

	@Override
	public void updateDoctordetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of Doctor to Edit");
		String name = ClinicUtility.userStringInput();
		for(int i=0;i<doctorList.size();i++) {
			if(doctorList.get(i).getName().equals(name)) {
				doctorList.get(i).setSpecialization(ClinicUtility.getSpecializaton());
				doctorList.get(i).setAvailable(ClinicUtility.getAvailability());
				System.out.println("Doctor's Details Updated");
				return;
			}
		}System.out.println("Entry Not Found");
		
	}

	@Override
	public void addPatient() {
		// TODO Auto-generated method stub
		Patient patient = new Patient();
		patient.setName(ClinicUtility.getName());
		patient.setId(ClinicUtility.getId());
		ClinicUtility.userStringInput();
		patient.setPhoneNumber(ClinicUtility.getPhoneNumber());
		patient.setAge(ClinicUtility.getAge());
		
		patientList.add(patient);
		
		System.out.println("Patient's Details added");
	}

	@Override
	public void deletePatient() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Patients' name to delete from Entry");
		String name= ClinicUtility.userStringInput();
		for(int i =0;i<patientList.size();i++) {
			if(patientList.get(i).getName().equals(name)) {
				patientList.remove(i);
				System.out.println("Patient's Details Deleted");
				return;
			}
		}System.out.println("Entry not found");
		
	}

	@Override
	public void updatePatientDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Patients' Name to Update details ");
		String name = ClinicUtility.userStringInput();
		for(int i=0;i<patientList.size();i++) {
			if(patientList.get(i).getName().equals(name)) {
				patientList.get(i).setPhoneNumber(ClinicUtility.getPhoneNumber());
				patientList.get(i).setAge(ClinicUtility.getAge());
				System.out.println("Patient's Details Updated");
				return;
			}
		}System.out.println("Entry not Found");
		
	}

	public void takeAppointment() {
		
		System.out.println("Select Your Appointment with the Available Doctors Below: ");
		showDoctors();
		Appointment appointment = new Appointment();
		System.out.println("Enter the Doctor Name To Book an Appointment");
		String doctorName = ClinicUtility.userStringInput();
		System.out.println("Enter The Patient Name to Book For");
		String searchName=ClinicUtility.userStringInput();
		String patientName="";
		int patientId=0;
		for(int j=0;j<patientList.size();j++) {
			if(patientList.get(j).getName().equals(searchName)){
				patientName=patientList.get(j).getName();
				patientId=patientList.get(j).getId();
				
			}
		}
		for(int i=0;i<doctorList.size();i++) {
			if(doctorList.get(i).getName().equals(doctorName) && checkDoctorAvailability(doctorList.get(i))) {
				appointment.setDoctorName(doctorList.get(i).getName());
				appointment.setDoctorId(doctorList.get(i).getId());
				appointment.setPatientName(patientName);
				appointment.setPatientId(patientId);
				appointment.setTimeStamp(ClinicUtility.getTimeStamp());
				doctorList.get(i).setPatientCount(doctorList.get(i).getPatientCount()+1);
				
				appointmentList.add(appointment);
				System.out.println("Appointment Confirmed");
				return;
			}
		}
	
		System.out.println("Sorry No Doctors Available Today");
		System.out.println("Please Check for Next Time");
		
	}
	
	public boolean checkDoctorAvailability(Doctor doctor) {
			if(doctor.getPatientCount()<5) {
				return true;
		}
			return false;
	}
	public void save() throws IOException {
		System.out.println("File saved");
		ClinicUtility.saveDoctorList(doctorList);
		ClinicUtility.savePatientList(patientList);
		ClinicUtility.saveAppointmentList(appointmentList);
	}

	
}
