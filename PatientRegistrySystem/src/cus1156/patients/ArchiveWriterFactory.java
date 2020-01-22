package cus1156.patients;

public class ArchiveWriterFactory {
     public static PatientArchiveWriter getPatientArchiveWriter(String filePath) {
    	 String type = getFileExtension(filePath);
    	 PatientArchiveWriter writer=null;
    	 if (type != null) {
    	 switch (type) {
    	 case "txt" :
    		 writer = new PatientArchiveCSVWriter(filePath);
    		 break;
    	 case "json" :
    //		 writer = new PatientArchiveJSONWriter(filePath);
            break;
         default:
    	
    	 }
    	 }
    	 return writer;  
     }
     
     public static DoctorArchiveWriter getDoctorArchiveWriter(String filePath) {
    	 String type = getFileExtension(filePath);
    	 DoctorArchiveWriter writer=null;
    	 if (type != null) {
    	 switch (type) {
    	 case "txt" :
    		 writer = new DoctorArchiveCSVWriter(filePath);
    		 break;
    	 case "json" :
    //		 writer = new DoctorArchiveJSONWriter(filePath);
            break;
         default:
    	
    	 }
    	 }
    	 return writer; 
     }
     
     
     private static String getFileExtension(String fileName) {
	      if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
	         return fileName.substring(fileName.lastIndexOf(".") + 1);
	      else
	         return "";
	   }
}
