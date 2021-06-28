package com.aarya.types;

public class Author {

   public int autherId;
   public String autherName;
   
   
   public void createNewAuther(int autherID,String autherName)
   {
	   this.autherId= autherID;
	   this.autherName= autherName;
   }
   
   public String toString()
   {
	   return String.format("%d20 %s",this.autherId,this.autherName);
   }
}

