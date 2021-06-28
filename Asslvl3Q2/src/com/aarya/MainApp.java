package com.aarya;

import com.aarya.types.Author;
import com.aarya.types.Book;
import com.aarya.types.Publication;

public class MainApp
{

	public static void main(String[] args) {
		
      Author a1=new Author();
      a1.createNewAuther(101,"snehal");
      
      Author a2=new Author();
      a2.createNewAuther(102,"Avnish");
		
      Author a3=new Author();
      a3.createNewAuther(103,"amish");
      
      
      Publication p1=new Publication();
      p1.createNewPublication(17051,"navbharat");
      
      Publication p2=new Publication();
      p2.createNewPublication(17052,"Bharti");
      
	Book []data=new Book[4];	
	
	data[0]=new Book();
	data[0].Addbook(1, "Ravan", a1,p1);
	
	data[1]=new Book();
	data[1].Addbook(2, "Sati", a2,p2);
	
	data[2]=new Book();
	data[2].Addbook(3, "Ram", a3,p1);
	
	data[3]=new Book();
	data[3].Addbook(4, "Krishna", a1,p2);
	
	
	for(int i=0;i<data.length;i++)
	{
		System.out.println(data[i]);
	}
	
	SearchBookbyAuther(data,"amish");
	sortBookbyName(data);
	
	}
	
	public static void SearchBookbyAuther(Book []records,String Auther_name)
	{
		
	}

	public static void sortBookbyName(Book []rec)
	{
		
		for(int j=0;j<rec.length;j++)
		{
		  
		  {
			  System.out.println("somethiing");
		  }
		}
	}
}