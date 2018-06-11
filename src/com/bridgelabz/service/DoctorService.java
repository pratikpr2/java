package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Doctor;

public interface DoctorService {
	
	void showDoctorDetails(List<Doctor> list);
	void searchDoctorById(List<Doctor> list);
	void searchDoctorByName(List<Doctor> list);
	void searchDoctorBySpecialization(List<Doctor> list);
	void searchDoctorByAvailability(List<Doctor> list);
	
}
