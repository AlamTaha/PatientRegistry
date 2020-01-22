package cus1156.patients;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PatientList {

	
	static Logger logger = Logger.getLogger(PatientList.class.getName());

	// List for patients
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	
	public void add(Patient pat) {
		patients.add(pat);
		logger.log(Level.FINE, "adding patient " + pat.toString());
	}

	
	public Patient findBySSN(String ssn) {
		for (Patient pat : patients) {
			if (ssn.equals(pat.getSsn())) {
				logger.log(Level.FINE, "Patient found with ssn [" + ssn + "] : " + pat.toString());
				return pat;
			}
		}
		logger.log(Level.FINE, "Patient not found with ssn :" + ssn);
		return null;
	}

	
	public String toString() {
		String outStr = "";
		for (Patient pat : patients)
			outStr = outStr + pat.toString();
		return outStr;
	}
	
	public static Iterator<Patient> PatientList1(){
			return Patient.GetIterator();
	}
	

}
