package com.bridgelabz.serviceImplimentation;

import java.util.List;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.service.DoctorService;
import com.bridgelabz.utility.ClinicUtility;

public class DoctorServiceImplement implements DoctorService {

	public void showDoctorDetails(List<Doctor> list) {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("List Of Doctors");
		System.out.println("*****************");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"-----------------");
			System.out.println("Name: "+list.get(i).getName());
			System.out.println("Id: "+list.get(i).getId());
			System.out.println("Specialization: "+list.get(i).getSpecialization());
			System.out.println("Availability: "+list.get(i).getAvailable());
			System.out.println("Patients Assigned: "+list.get(i).getPatientCount());
		}
		
	}

	@Override
	public void searchDoctorById(List<Doctor> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Doctor's Id to search: ");
		int id = ClinicUtility.userIntegerInput();
		System.out.println("Showing Doctor By Id: ");
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Specialization: "+list.get(i).getSpecialization());
				System.out.println("Availabilty: "+list.get(i).getAvailable());
				System.out.println("Patients Assigned: "+list.get(i).getPatientCount());
				return;
			}
		}System.out.println("Entry not found");
		
	}

	@Override
	public void searchDoctorByName(List<Doctor> list) {
		// TODO Auto-generated method stub
		ClinicUtility.userStringInput();
		System.out.println("Enter the Doctor's Name to search: ");
		String name = ClinicUtility.userStringInput();
		System.out.println("Showing Doctor By Name: ");
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Specialization: "+list.get(i).getSpecialization());
				System.out.println("Availabilty: "+list.get(i).getAvailable());
				System.out.println("Patients Assigned: "+list.get(i).getPatientCount());
				return;
			}
		}System.out.println("Entry not found");
	}

	@Override
	public void searchDoctorBySpecialization(List<Doctor> list) {
		// TODO Auto-generated method stub
		ClinicUtility.userStringInput();
		System.out.println("Enter the Specialization to search: ");
		String specialization = ClinicUtility.userStringInput();
		System.out.println("Showing Doctor By Specialization: ");
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getSpecialization().equals(specialization)) {
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Specialization: "+list.get(i).getSpecialization());
				System.out.println("Availabilty: "+list.get(i).getAvailable());
				System.out.println("Patients Assigned: "+list.get(i).getPatientCount());
				return;
			}
		}System.out.println("Entry not found");
	}

	@Override
	public void searchDoctorByAvailability(List<Doctor> list) {
		// TODO Auto-generated method stub
		
		ClinicUtility.userStringInput();
		System.out.println("Enter the Availability to search: ");
		String availability = ClinicUtility.userStringInput();
		System.out.println("Showing Doctor By Availability: ");
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getAvailable().equals(availability)) {
				System.out.println("Name: "+list.get(i).getName());
				System.out.println("Id: "+list.get(i).getId());
				System.out.println("Specialization: "+list.get(i).getSpecialization());
				System.out.println("Availabilty: "+list.get(i).getAvailable());
				System.out.println("Patients Assigned: "+list.get(i).getPatientCount());
				return;
			}
		}System.out.println("Entry not found");
		
	}

}
