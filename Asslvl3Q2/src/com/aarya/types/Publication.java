package com.aarya.types;

public class Publication {
 
	 public int publicationID;
	 public String publicationName;
	 
	 public void createNewPublication(int publicationID,String publicationName)
	 {
		 this.publicationID = publicationID;
		 this.publicationName = publicationName;
	 }
	 
	 public String toString()
	 {
		 return String.format("%d20 %s",this.publicationID,this.publicationName);
	 }
}
