package cus1156.patients;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Represents one visit by a patient to a provider. A visit record contains the
 * patient's ssn, the provider's NPI, and the date of the visit.
 */
public class Visit {
	private String patSSN;
	private String npi;
	private Date date;

	
	public Visit() {
	}


	public Visit(String patSSN, String npi, Date date) {
		super();
		this.patSSN = patSSN;
		this.npi = npi;
		this.date = date;
	}


	public String getPatSSN() {
		return patSSN;
	}

	public void setPatSSN(String patSSN) {
		this.patSSN = patSSN;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String dateStr = sdf.format(date);
		String ls = System.getProperty("line.separator");
		return (patSSN + "|" + npi + "|" + dateStr + ls);
	}
}
