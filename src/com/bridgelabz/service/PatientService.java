package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Patient;

public interface PatientService {

	void showPatientDetails(List<Patient> list);
	void searchPatientByName(List<Patient> list);
	void searchPatientByNumber(List<Patient> list);
	void searchPatientById(List<Patient> list);
	void searchMostPopularDoctor(List<Patient> list);
	void searchMostPopularSpecialization(List<Patient> list);
	
}
