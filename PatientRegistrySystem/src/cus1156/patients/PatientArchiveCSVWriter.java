package cus1156.patients;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public  class PatientArchiveCSVWriter extends PatientArchiveWriter {
	private String newline;

	public PatientArchiveCSVWriter(String filePath) {
		super(filePath);
		newline = System.lineSeparator();

	}
	public void write (Iterator<Patient> patientIter) {
		try {
			FileWriter outFile = new FileWriter(new File(filePath));


			while (patientIter.hasNext()){
				Patient patient = patientIter.next();
				String output = patient.getFname() + "," + patient.getLname() + "," + patient.getSsn() + "," + patient.getCity() + "," + patient.getState() + newline;
				System.err.println(output);
				outFile.write(output);
			} 
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	
	}

	/*  
			    String output = ((Patient) patient.getPatient()).getSsn() +"," +  ((Doctor) Doctor.getDoctor()).getNpi() + newline;
			    System.err.println(output);
				outFile.write(output);
	 */

}

