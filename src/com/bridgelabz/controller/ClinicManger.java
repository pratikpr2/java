package com.bridgelabz.controller;

import java.io.IOException;

import com.bridgelabz.serviceImplimentation.ManagerServiceImplement;

public class ClinicManger {

	public static void main(String[] args) throws IOException {
		
		ManagerServiceImplement manager = new ManagerServiceImplement();
		//manager.showDoctors();
		//manager.showPatients();
		//manager.searchDoctorsByKey();
		//manager.addDoctor();
		//ClinicUtility.userStringInput();
		//manager.addDoctor();
		manager.takeAppointment();
		//manager.deleteDoctor();
		//manager.updateDoctordetails();
		//ClinicUtility.userStringInput();
		//manager.addPatient();
		//manager.deletePatient();
		//manager.updatePatientDetails();
		manager.save();
	}
}
