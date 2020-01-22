package cus1156.patients;
import java.util.Iterator;
import java.util.List;

public abstract class PatientArchiveWriter {
	protected String filePath;
	
	public PatientArchiveWriter(String filePath) {
		this.filePath = filePath;
	}
	
	public abstract void write(Iterator<Patient> patientIter);

	

}
