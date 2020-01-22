package cus1156.patients;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VisitList {
	
	
	static Logger logger = Logger.getLogger(PatientList.class.getName());
	

	private ArrayList<Visit> visitRecords = new ArrayList<Visit>();
	

	public void add(Visit visit) {
		visitRecords.add(visit);
		logger.log(Level.FINE, "adding visit " + visit.toString());
	}

	
	public ArrayList<Visit> findByDate(Date date) {
		ArrayList<Visit> visits = new ArrayList<Visit>();
		for (Visit visit : visitRecords) {
			if (date.equals(visit.getDate()))
				visits.add(visit);
		}
		logger.log(Level.FINE, "Found visit by date: " + visits.toString());
		return visits;
	}

	
	public Visit find(String ssn, String npi) {
		for (Visit visit : visitRecords) {
			if (ssn.equals(visit.getPatSSN()) && npi.equals(visit.getNpi())) {
				logger.log(Level.FINE, "Found visits: " + visit.toString());
				return visit;
			}
		}
		logger.log(Level.FINE, "Visit not found.");
		return null;
	}

	
	public ArrayList<Visit> findBySSN(String ssn) {
		ArrayList<Visit> visits = new ArrayList<Visit>();

		for (Visit visit : visitRecords) {
			if (ssn.equals(visit.getPatSSN())) {
				visits.add(visit);
			}
		}
		logger.log(Level.FINE, "Visits found by SSN " + "[" + ssn + "] : " + visits.toString());
		return visits;
	}

	
	public ArrayList<Visit> findByNPI(String npi) {
		ArrayList<Visit> visits = new ArrayList<Visit>();

		for (Visit visit : visitRecords) {
			if (npi.equals(visit.getNpi())) {
				visits.add(visit);
			}
		}
		logger.log(Level.FINE, "Visits found by NPI [" + npi + "]: " + visits.toString());
		return visits;
	}

	public String toString() {
		String outStr = "";
		for (Visit visit : visitRecords)
			outStr = outStr + visit.toString();
		return outStr;
	}
}
