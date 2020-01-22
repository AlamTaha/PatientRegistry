package cus1156.patients;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * A class that writes the list of patients to a
 * JSON formatted file
 * For each patient, the ssn and the npi is recorded
 *
 */
public class PatientArchiveJSONWriter extends PatientArchiveWriter {

	public PatientArchiveJSONWriter(String filePath) {
		super(filePath);

	}

	
	public void write(Iterator<Patient> patientIter) {
	/*	PatientArchiveJSONWriter finalObj = new PatientArchiveJSONWriter(filePath);
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
		
	} */

}

	private char[] toJSONString() {
		// TODO Auto-generated method stub
		return null;
	}

}