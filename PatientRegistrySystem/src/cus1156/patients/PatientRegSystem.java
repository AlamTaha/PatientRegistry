package cus1156.patients;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This component is the main component of the patient information system It
 * manages the lists of doctors, patients, and visits
 */
public class PatientRegSystem {
	private PatientList patients = new PatientList();
	private DoctorList doctors = new DoctorList();
	private VisitList visits = new VisitList();

	static Logger logger = Logger.getLogger(PatientRegSystemInit.class.getName());

	
	public void addPatient(Patient pat) {
		patients.add(pat);
	}
	
	
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}

	
	public void addVisit(Visit visit) {
		visits.add(visit);
	}

	
	public Patient findPatientBySSN(String ssn) {
		return patients.findBySSN(ssn);
	}

	
	public Doctor findDoctorByNPI(String npi) {
		return doctors.findByNPI(npi);
	}

	
	public ArrayList<FullVisitInfo> getVisitsByDate(Date date) {
		ArrayList<Visit> retVisits = visits.findByDate(date);
		ArrayList<FullVisitInfo> fullVisits = new ArrayList<FullVisitInfo>();
		for (Visit visit : retVisits) {
			String patSSN = visit.getPatSSN();
			String npi = visit.getNpi();
			Patient pat = patients.findBySSN(patSSN);
			Doctor doc = doctors.findByNPI(npi);
			FullVisitInfo fullInfo = new FullVisitInfo(pat, doc, visit);
			fullVisits.add(fullInfo);
		}
		logger.log(Level.FINE, "Getting Visits by date [" + date + "] : " + fullVisits.toString());
		return fullVisits;
	}

	
	public ArrayList<FullVisitInfo> getVisitsByDoctor(String npi) {

		ArrayList<Visit> retVisits = visits.findByNPI(npi);
		ArrayList<FullVisitInfo> fullVisits = new ArrayList<FullVisitInfo>();
		for (Visit visit : retVisits) {
			String patSSN = visit.getPatSSN();
			Patient pat = patients.findBySSN(patSSN);
			Doctor doc = doctors.findByNPI(npi);
			FullVisitInfo fullInfo = new FullVisitInfo(pat, doc, visit);
			fullVisits.add(fullInfo);
		}
		Collections.sort(fullVisits, new FullVisitInfoComparatorByPatLname());
		logger.log(Level.FINE, "Getting sorted visits by doctor with NPI [" + npi + "]: " + fullVisits.toString());
		return fullVisits;
	}

	
	public ArrayList<FullVisitInfo> getVisitsByPatient(String ssn) {

		ArrayList<Visit> retVisits = visits.findBySSN(ssn);
		ArrayList<FullVisitInfo> fullVisits = new ArrayList<FullVisitInfo>();
		for (Visit visit : retVisits) {
			String npi = visit.getNpi();
			Patient pat = patients.findBySSN(ssn);
			Doctor doc = doctors.findByNPI(npi);
			FullVisitInfo fullInfo = new FullVisitInfo(pat, doc, visit);
			fullVisits.add(fullInfo);
		}
		Collections.sort(fullVisits, new FullVisitInfoComparatorByDocLname());
		logger.log(Level.FINE, "Getting sorted visits by patients with SSN [" + ssn + "]: " + fullVisits.toString());
		return fullVisits;
	}

	
	public String getPatientListRecord() {
		return patients.toString();
	}

	
	public String getDoctorListRecord() {
		return doctors.toString();
	}

	
	public String getVisitListRecord() {
		return visits.toString();
	}
	
	public Iterator <Patient> getPatientiterator() {
		return patients.PatientList1();
	}

}
