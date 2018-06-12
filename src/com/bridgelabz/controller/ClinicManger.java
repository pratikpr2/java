package com.bridgelabz.controller;

import java.io.IOException;

import com.bridgelabz.serviceImplimentation.ManagerServiceImplement;
import com.bridgelabz.utility.ClinicUtility;

public class ClinicManger {
	
	static int option;
	static ManagerServiceImplement manager;
	public static void main(String[] args) throws IOException {
		
		manager = new ManagerServiceImplement();
		
		while(option!=3) {
			System.out.println("************************************");
			System.out.println("WELCOME TO CLINIC MANAGEMENT SYSTEM");
			System.out.println("ENTER VALID OPTIONS To ACCESS MENU");
			System.out.println("************************************");
			System.out.println("          1: MENU 1  ");
			System.out.println(" ADD || DELETE || UPDATE || SEARCH");
			System.out.println("       DOCTOR/PATIENT");
			System.out.println("------------------------------");
			System.out.println("          2: MENU 2  ");
			System.out.println("    SHOW DOCTORS || SHOW PATIENTS ");
			System.out.println("        TAKE APPOINTMENT");
			System.out.println("  POPULAR DOCTOR || POPULAR SPECIALIZATION");
			System.out.println("--------------------------------");
			System.out.println("          3: EXIT !");
			option =ClinicUtility.userIntegerInput();
			switch(option) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				System.out.println("Exiting Program");
				break;
			default:
				System.out.println("Invalid option");
			}
		}
	}
	private static void menu2() throws IOException {
		// TODO Auto-generated method stub
		int option2=0;
		while(option2!=7) {
			System.out.println("         Menu To Fix An AppointMent");
			System.out.println("1: SHOW Doctor Details || 2: SHOW Patient Details ");
			System.out.println("3: SHOW Popular Doctor || 4: SHOW Popular Specialization ");
			System.out.println("5: TAKE An AppointMent || 6: SAVE");
			System.out.println("                    7: EXIT");
			option2=ClinicUtility.userIntegerInput();
			switch(option2) {
			case 1:
				manager.showDoctors();
				break;
			case 2:
				manager.showPatients();
				break;
			case 3:
				manager.searchPopularDoctor();;
				break;
			case 4:
				manager.searchPopularSpecialization();
				break;
			case 5:
				manager.takeAppointment();
				break;
			case 6:
				manager.save();
				break;
			case 7:
				System.out.println("EXITING MENU 2");
				break;
			default:
				System.out.println("INVALID OPTION");
			}
		}
	}
	private static void menu1() throws IOException {
		// TODO Auto-generated method stub
		int option1=0;
		while(option1!=10) {
			System.out.println("Menu To ADD/DELETE/UPDATE Doctors & Patients");
			System.out.println("   Doctor       ||      Patient");
			System.out.println("   1: ADD       ||      2: ADD ");
			System.out.println("   3: UPDATE    ||      4: UPDATE");
			System.out.println("   5: SEARCH    ||      6: SEARCH");
			System.out.println("   7: DELETE    ||      8: DELETE");
			System.out.println("   9: SAVE      ||      10: EXIT");
			option1=ClinicUtility.userIntegerInput();
			switch(option1) {
			
			case 1:
				manager.addDoctor();
				break;
			case 2:
				manager.addPatient();
				break;
			case 3:
				manager.updateDoctordetails();
				break;
			case 4:
				manager.updatePatientDetails();
				break;
			case 5:
				manager.searchDoctorsByKey();
				break;
			case 6:
				manager.searchPatientByKey();
				break;
			case 7:
				manager.deleteDoctor();
				break;
			case 8:
				manager.deletePatient();;
				break;
			case 9:
				manager.save();
				break;
			case 10:
				System.out.println("EXITING MENU 1");
				break;
			default:
				System.out.println("INVALID OPTION");
			}
		}

	}
}