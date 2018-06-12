package com.bridgelabz.serviceImplimentation;

import java.util.List;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.PatientService;
import com.bridgelabz.utility.ClinicUtility;

public class PatientServiceImplement implements PatientService {

	@Override
	public void showPatientDetails(List<Patient> list) {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("List Of Patients");
		System.out.println("*****************");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"-----------------");
			System.out.println("Name: "+list.get(i).getName());
			System.out.println("Id: "+list.get(i).getId());
			System.out.println("Contact No.: "+ list.get(i).getPhoneNumber());
			System.out.println("Age :"+list.get(i).getAge());
		}
		
	}

	@Override
	public void searchPatientByName(List<Patient> list) {
		// TODO Auto-generated method stub
		ClinicUtility.userStringInput();
		System.out.println("Enter the Patient Name to get Details: ");
		String name = ClinicUtility.userStringInput();
		for(int i=0;i<list.size();i++) {
			
		if(list.get(i).getName().equals(name)) {
				System.out.println("Showing Patient Details By Name ");
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Contact Number: "+list.get(i).getPhoneNumber());
				System.out.println("Age: "+list.get(i).getAge());
				
				return ;
			}
		}System.out.println("Entry Not Found");
		
	}

	@Override
	public void searchPatientByNumber(List<Patient> list) {
		// TODO Auto-generated method stub
		ClinicUtility.userStringInput();
		System.out.println("Enter the Patient Number to get Details: ");
		String number = ClinicUtility.userStringInput();
		for(int i=0;i<list.size();i++) {
			
		if(list.get(i).getPhoneNumber().equals(number)) {
				System.out.println("Showing Patient Details By Contact Number ");
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Contact Number: "+list.get(i).getPhoneNumber());
				System.out.println("Age: "+list.get(i).getAge());
				
				return ;
			}
		}System.out.println("Entry Not Found");
	}

	@Override
	public void searchPatientById(List<Patient> list) {
		// TODO Auto-generated method stub
		ClinicUtility.userStringInput();
		System.out.println("Enter the Patient Id to get Details: ");
		int id = ClinicUtility.userIntegerInput();
		for(int i=0;i<list.size();i++) {
			
		if(list.get(i).getId()==id) {
				System.out.println("Showing Patient Details By Id ");
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Contact Number: "+list.get(i).getPhoneNumber());
				System.out.println("Age: "+list.get(i).getAge());
				
				return ;
			}
		}System.out.println("Entry Not Found");
	}

	
	@Override
	public void searchMostPopularDoctor(List<Doctor> list) {
		// TODO Auto-generated method stub
		int mostPopular = list.get(0).getPatientCount();
		int last=0;
		for(int i=1;i<list.size();i++) {
			if(mostPopular<list.get(i).getPatientCount()) {
				mostPopular=list.get(i).getPatientCount();
				last = i;
			}
		}
		String mostPopularDoctor=list.get(last).getName();
		System.out.println("Most Popular Doctor: "+mostPopularDoctor);
	}

	@Override
	public void searchMostPopularSpecialization(List<Doctor> list) {
		// TODO Auto-generated method stub
		int mostPopular = list.get(0).getPatientCount();
		int last=0;
		for(int i=1;i<list.size();i++) {
			if(mostPopular<list.get(i).getPatientCount()) {
				mostPopular=list.get(i).getPatientCount();
				last = i;
			}
		}
		String mostPopularSpecialization=list.get(last).getSpecialization();
		System.out.println("Most Popular Specialization: "+mostPopularSpecialization);
	}



}
