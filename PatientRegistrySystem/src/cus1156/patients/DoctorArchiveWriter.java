package cus1156.patients;
import java.util.Iterator;
import java.util.List;


public abstract class DoctorArchiveWriter {
	protected String filePath;
	
	public DoctorArchiveWriter(String filePath) {
		this.filePath = filePath;
	}
	
	public abstract void write(Iterator<Doctor> doctorIter);

}
