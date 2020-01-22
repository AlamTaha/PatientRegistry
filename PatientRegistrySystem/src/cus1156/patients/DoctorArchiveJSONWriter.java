package cus1156.patients;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * A class that writes the list of votes to a
 * JSON formatted file
 * For each doctor, the patient ssn and the npi is recorded
 *
 */
public class DoctorArchiveJSONWriter extends PatientArchiveWriter {

	public DoctorArchiveJSONWriter(String filePath) {
		super(filePath);

	}

	/**
	 * Writes a vote record (voter id, candidate id) in JSON form to a file
	 */
	public void write(Iterator<Patient> patientIter) {
	/*	  JSONObject finalObj = new JSONObject();
		  JSONArray list = new JSONArray();

		while (patientIter.hasNext()) {
			Patient patient = patientIter.next();

			JSONObject obj = new JSONObject();
			  obj.put("voterId", vote.getVoter().getId());
			  obj.put("candidateId", vote.getCand().getId());

			list.add(obj);

		}
		finalObj.put("votes", list);

		try {
			FileWriter outFile = new FileWriter(new File(filePath));
			outFile.write(finalObj.toJSONString());
			outFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
