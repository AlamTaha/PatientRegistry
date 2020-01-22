package cus1156.patients;

public class ArchiveReaderFactory {
	  public static PatientArchiveCSVWriter getPatientArchiveReader(String filePath) {
	    	 String type = getFileExtension(filePath);
	    	 PatientArchiveCSVWriter reader=null;
	    	 if (type != null) {
	    	 switch (type) {
	    	 case "txt" :
	    		 reader = new PatientArchiveCSVWriter(filePath);
	    		 break;
	    	 case "json" :
   //    		 PatientArchiveJSONWriter writer = new PatientArchiveJSONWriter(filePath);
	            break;
	         default:
	    	
	    	 }
	    	 }
	    	 return reader;  
	     }
	  
	  private static String getFileExtension(String fileName) {
	      if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
	         return fileName.substring(fileName.lastIndexOf(".") + 1);
	      else
	         return "";
	   }
}
