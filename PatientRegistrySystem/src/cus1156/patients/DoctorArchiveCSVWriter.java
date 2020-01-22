package cus1156.patients;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public  class DoctorArchiveCSVWriter extends DoctorArchiveWriter {
	private String newline;
	
	public DoctorArchiveCSVWriter(String filePath) {
		super(filePath);
		newline = System.lineSeparator();
		
	}
	public void write (Iterator<Doctor> doctorIter) {
		try {
			FileWriter outFile = new FileWriter(new File(filePath));
			
		   while (doctorIter.hasNext()){
			   Doctor doctor = doctorIter.next(); 
			    String output = Doctor.getFname() + "," + Doctor.getLname() + "," + Doctor.getNpi() + "," Doctor.getCity() + "," Doctor.getState() newline;
			    System.err.println(output);
				outFile.write(output);
			}
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
}
